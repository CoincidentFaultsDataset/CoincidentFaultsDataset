/**
 * @author [IDENTIFYING INFORMATION REMOVED]
 */

public class MagicTrees {
    /**
     * Main method
     * 
     * COMMAND LINE ARGUMENTS:
     *      -r: Tree ages are randomly generated; no prompt to input tree ages will appear.
     */
    public static void main(String[] args) {
        Boolean randomGen = false;
        if(args.length > 0){
            for(int i = 0; i< args.length; i++){
                if(args[i].equalsIgnoreCase("-r")){
                    randomGen = true;
                }
            }
        }

        ProgramRun run = new ProgramRun();
        run.mainLoop(randomGen);

    }

}
