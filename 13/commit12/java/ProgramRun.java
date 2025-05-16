import java.lang.Math;
import java.util.Random;

public class ProgramRun {

    private int totalNumberOfBuds = 0;

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

        //System.out.println("Number of trees in forest: " + numTree);
        //System.out.println("Ages of trees: " + treeAges);

        int[] arrTreeAges = stringArrToIntArr(treeAges);
        int[] numberOfBudsForEachTree = getNumberOfBudsForEachTree(numTree, arrTreeAges);
        System.out.println("");

        System.out.println(this.totalNumberOfBuds);
        PrintOutput printOut = new PrintOutput();
        for(int j=0; j<numberOfBudsForEachTree.length; j++){
            //System.out.println(numberOfBudsForEachTree[j]);
            printOut.printstuff(numberOfBudsForEachTree[j], numTree);
            System.out.println("");
        }
        
    }

    private int[] stringArrToIntArr(String string){

        String[] temp = string.split(" ");
        int[] arrInt = new int[temp.length];
        for(int i=0; i<temp.length; i++){
            arrInt[i] = Integer.parseInt(temp[i]);
        }

        return arrInt;

    }

    private int[] getNumberOfBudsForEachTree(int numTree, int[] arrTreeAges){

        int[] numberOfBudsForEachTree = new int[numTree];
        for(int j=0; j<arrTreeAges.length; j++){
            numberOfBudsForEachTree[j] = (int) Math.pow(2, arrTreeAges[j]);
            totalNumberOfBuds += numberOfBudsForEachTree[j];
        }

        return numberOfBudsForEachTree;
    }

}
