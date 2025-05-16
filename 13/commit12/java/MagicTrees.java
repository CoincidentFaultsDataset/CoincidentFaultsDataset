//import java.time.LocalDateTime;

/**
 * @author [IDENTIFYING INFORMATION REMOVED]
 */

public class MagicTrees {
    /**
     * Main method - prints a friendly message.
     */
    public static void main(String[] args) {
        //System.out.println("Hello, world!");
        Boolean randomGen = false;
        if(args.length > 0){
            randomGen = true;
        }

        ProgramRun run = new ProgramRun();
        run.mainLoop(randomGen);

    }

    /**
     * Return a greeting that matches the time of day given by datetime:
     * * "Good morning" if it's after midnight and before noon
     * * "Good afternoon" if it's between noon and 5:00pm
     * * "Good evening" if it's between 5:00pm and midnight.
     * Precondition: datetime is not null.
     */
    // public static String getGreeting(LocalDateTime datetime) {
    //     return "Good morning";
    // }

}
