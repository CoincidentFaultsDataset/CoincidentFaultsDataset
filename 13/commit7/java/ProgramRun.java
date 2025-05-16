import java.lang.Math;
import java.util.Random;

public class ProgramRun {

    public void mainLoop(Boolean randomGen){
        //System.out.println("Ok!");
        Random random = new Random();

        UserInput input = new UserInput();

        int numTree = input.setNumTreeInForest();

        if(randomGen){
            System.out.println("Generating random ages...");
        }
        String treeAges = "";
        for(int i=0; i<numTree; i++){
            int age = 0;
            if(randomGen){
                age = random.nextInt(7);
            }
            else{
                age = input.setAge(i+1);
            }
            treeAges += age + " ";
        }

        System.out.println("Number of trees in forest: " + numTree);
        System.out.println("Ages of trees: " + treeAges);

        int[] numberOfBudsForEachTree = getNumberOfBudsForEachTree(numTree, treeAges);

        PrintOutput printOut = new PrintOutput();

        for(int j=0; j<numberOfBudsForEachTree.length; j++){
            System.out.println(numberOfBudsForEachTree[j]);
            printOut.printstuff(numberOfBudsForEachTree[j], numTree);
        }
        
    }

    private int[] getNumberOfBudsForEachTree(int numTree, String treeAges){

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
