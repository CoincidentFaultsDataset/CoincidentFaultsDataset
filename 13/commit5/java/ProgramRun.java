import java.lang.Math;

public class ProgramRun {

    public void mainLoop(Boolean randomGen){
        System.out.println("Ok!");

        UserInput input = new UserInput();

        int numTree = input.setNumTreeInForest();

        String treeAges = "";
        for(int i=0; i<numTree; i++){
            if(randomGen){
                System.out.println("bleugh");
            }
            int age = input.setAge(i+1);
            treeAges += age + " ";
        }

        System.out.println("Number of trees in forest: " + numTree);
        System.out.println("Ages of trees: " + treeAges);

        int[] numberOfBudsForEachTree = getNumberOfBudsForEachTree(numTree, treeAges);

        for(int j=0; j<numberOfBudsForEachTree.length; j++){
            System.out.println(numberOfBudsForEachTree[j]);
        }
        
    }

    public int[] getNumberOfBudsForEachTree(int numTree, String treeAges){

        String[] temp = treeAges.split(" ");  
        int[] arrTreeAges = new int[numTree];
        for(int i=0; i < temp.length; i++){
            arrTreeAges[i] = Integer.parseInt(temp[i]);
        }

        int[] numberOfBudsForEachTree = new int[numTree];
        for(int j=0; j<arrTreeAges.length; j++){
            numberOfBudsForEachTree[j] = (int) Math.pow(2, arrTreeAges[j]);

        }

        return numberOfBudsForEachTree;
    }

}
