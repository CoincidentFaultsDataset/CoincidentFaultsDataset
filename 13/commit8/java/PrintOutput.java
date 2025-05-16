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
        for(int i = 1; i<tree.length; i += Math.pow(2, val)){
            System.out.println(i);
            //tree[i][0] = 'Y';
            for(int j = i; j<tree[i].length; j += (i*2)+2){
                tree[i][j] = 'Y';
            }
            val++;
        }

    }

}
