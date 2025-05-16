import java.lang.Math;
import java.util.Arrays;

public class PrintOutput {
    
    public void printstuff(int numberOfBuds, int numberOfTrees){
        System.out.println("Ok!");

        char[][] tree = new char[numberOfBuds + 1][numberOfBuds + (numberOfBuds-1)];
        for (char[] row : tree) {
            Arrays.fill(row, '-');
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
        int numOfBranchChars = 0; //keep track of # of / and \ chars to print
        //int powerOf2 = Math.po
        for(int i = 1; i<tree.length; i += Math.pow(2, val)){
            System.out.println(i);
            for(int j = i; j<tree[i].length; j += (i*2)+2){
                tree[i][j] = 'Y';
                numOfBranchChars += 2; //since we're counting from the Y row *below*, so there will be twice as many chars to print
            }

            //empty lines above current i-row: function of (2^val)-1
            for(int k=i; k> (i - ((Math.pow(2, val))-1)); k--){
                //tree[k-1][k-1] = 'x';
                int numTemp = numOfBranchChars;
                int l = k-1;
                // while(l<tree[k-1].length || numTemp > 0){
                //     if(numTemp%2 == 0){
                //         tree[k-1][l] = 'x';
                //         l += (Math.pow(2, val)-1)+1;
                //     }
                //     else{
                //         tree[k=1][l] = 'x';
                //         l += ;
                //     }
                //     numTemp--;
                // }
                
                /* print offset of i # of spaces before printing the branch characters
                * # of pairs of / and \ characters correspond to 2^(numberOfTrees-1)-1 for each time we have a line of Ys
                * Space between the characters after the offset correspond to ((2^val)-1) +1
                * each time we go into this clause, we have a counter; perform modulo to determine if to input / or \
                */
            }

            val++;

        }

    }

}
