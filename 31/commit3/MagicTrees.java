import java.util.Scanner; 
import java.lang.Math;

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
            output = makeTree(input.nextInt(), output);
        }
        System.out.println(output);
    }

    /**
     * Description of Method
     * Precondition:
     */
    public static String makeTree(int age, String output) {
        output += "\nO";
        for (int i = 1; i < Math.pow(2, age); i++){
            output += "-O";
        } 
        output += "\n";
        return output;
    }
}
