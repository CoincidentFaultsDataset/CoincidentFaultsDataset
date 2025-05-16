import java.lang.Math;

public class PrintOutput {
    
    public void printstuff(int numberOfBuds, int numberOfTrees){
        System.out.println("Ok!");

        String[][] tree = new String[numberOfBuds + (numberOfBuds-1)][numberOfBuds + 1];

        generateBudLayer(tree, numberOfBuds);
        generateGrowthPoints(tree, numberOfTrees);

    }

    private void generateBudLayer(String[][] tree, int numberOfBuds){

        for(int i = 0; i<tree[0].length; i += 2){
            tree[0][i] = "o";
        }

    }

    private void generateGrowthPoints(String[][] tree, int numberOfTrees){

        for(int i = 1; i<tree.length; i += Math.pow(2, i)){
            tree[i][0] = "Y";
        }

    }

}
