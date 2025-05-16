import java.math.*;

public class MagicTrees {

    public static void main(String[] args) {
        // Fields
        int totalbuds = 0;
        // Stop user if all args are not fulfilled
        if (args.length < 2) {
            System.out.println("You need at least 1) # Trees 2) Age of first tree in years 3) Age of second tree in years etc. ");
            return;
        }
        // First print total number of growth buds in forest
        
        if (args.length == 2){
        // Base case (1 tree)
        int age = Integer.parseInt(args[1]);
        totalbuds = (int)Math.pow(age, 2);
        System.out.println(totalbuds);
        } else { // More than 1 tree
            int i = 1;
            int currAge = Integer.parseInt(args[i]);
            while (i < args.length) {
                totalbuds += (int)Math.pow(currAge, 2);
                i++;
            }
            System.out.println(totalbuds);
        }

    }

}