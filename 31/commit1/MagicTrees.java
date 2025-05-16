package lab1;
import java.util.Scanner; 

/**
 * @author [IDENTIFYING INFORMATION REMOVED]
 */
public class MagicTrees {
    /**
     * Main method 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO: Validate input
        int count = input.nextInt();
        String output = "" + count;
        for (int i = 0; i < count; i++){
            //TODO: Validate input
            makeTree(input.nextInt(), output);
        }
        System.out.println(output);

    }

    /**
     * Description of Method
     * Precondition:
     */
    public static String makeTree(int age, String output) {
        return null;
    }
}
