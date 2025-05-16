import java.lang.Math;
import java.util.Arrays;

public class PrintOutput {
    
    public void printstuff(int numberOfBuds, int numberOfTrees){

        char[][] tree = new char[numberOfBuds + 1][numberOfBuds + (numberOfBuds-1)];
        for (char[] row : tree) {
            Arrays.fill(row, ' ');
        }

        tree[tree.length-1][tree[0].length/2] = '|'; //this is the stem

        generateBudLayer(tree, numberOfBuds);
        generateGrowthPoints(tree, numberOfTrees);

        for(int i=0; i<tree.length; i++){
            for(int j=0; j<tree[i].length; j++){
                System.out.print(tree[i][j]);
            }
            System.out.print("\n");
        }

    }

    private void generateBudLayer(char[][] tree, int numberOfBuds){

        for(int i = 0; i<tree[0].length; i += 2){
            tree[0][i] = 'o';
        }

    }

    private void generateGrowthPoints(char[][] tree, int numberOfTrees){
        int val = 0;
        for(int i = 1; i<tree.length; i += Math.pow(2, val)){
            for(int j = i; j<tree[i].length; j += (i*2)+2){
                tree[i][j] = 'Y';
            }

            //empty lines above current i-row: function of (2^val)-1
            int powerOf2 = (int)Math.pow(2, val);
            int jump = 1;
            for(int k=i; k> (i - (powerOf2-1)); k--){

                /* print offset of i # of spaces before printing the branch characters
                * # of pairs of / and \ characters correspond to 2^(numberOfTrees-1)-1 for each time we have a line of Ys
                * When on an "even" branch character, jump 'l' by 2* the current jump value (resets to 1 for each i-loop iteration)
                *   The above works because we are filling the branch characters in the rows preceding the most recent row that we put the *   Growth Characters in. (i.e., we're going backwards, and the space between \ and / in this case is goes up by multiples of *   2 as we travel up the tree layers)
                * When on an "odd" branch character, jump 'l' by double the offset at the beginning of the row, + 2 for some reason
                * Decide "odd" and "even" by switching a boolean on and off. (modulo solution didn't work for some reason)
                * 
                * i hate math
                */

                int l = k-1;
                
                //System.out.println("level: " + l + "; previous exponent: " + val + "; JUMP = " + (2*jump) + "; NEXTTREE = " + ((l*2)+1));
                Boolean even = true;
                while(l < (tree[k-1].length-1) ){
                    if(even){
                        tree[k-1][l] = '\\';
                        l+= 2*jump;
                        even = false;
                    }
                    else{
                        tree[k-1][l] = '/';
                        //System.out.println("currLevel: " + (k-1) + "; currentPos: " + l);
                        l+= ((k-1)*2)+2;
                        //System.out.println("Jumped to: " + l);
                        even = true;
                    }
                    
                }
                jump++;
                
            }

            val++;

        }

    }

}
