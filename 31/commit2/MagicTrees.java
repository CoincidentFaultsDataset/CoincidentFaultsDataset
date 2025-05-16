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
        System.out.println("" + count);
        for (int i = 0; i < count; i++){
            //TODO: Validate input
            makeTree(input.nextInt());
        }

    }

    /**
     * Description of Method
     * Precondition:
     */
    public static String makeTree(int age) {
        String output = "O";
        for (int i = 1; i < age; i++){
            output += "-O";
        } 
        System.out.println(output);
        return null;
    }
}
