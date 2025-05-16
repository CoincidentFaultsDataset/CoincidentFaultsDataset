

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
        
    }

}
