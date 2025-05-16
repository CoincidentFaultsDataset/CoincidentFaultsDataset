

public class ProgramRun {

    public void mainLoop(){
        System.out.println("Ok!");

        UserInput input = new UserInput();

        int numTree = input.setNumTreeInForest();

        String treeAges = "";
        for(int i=0; i<numTree; i++){
            int age = input.setAge(i+1);
            treeAges += age + " ";
        }

        System.out.println(treeAges);
        
    }

}
