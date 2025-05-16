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
            if (age == 0){ // exponential won't work if age is 0
                totalbuds = 1;
            }
            System.out.println(totalbuds);
            
            // Print actual tree for base case
            // age 0
            System.out.println("O\n|");

        } else { // More than 1 tree
            int i = 1;
            while (i < args.length) {
                int currAge = Integer.parseInt(args[i]);
                totalbuds += (int)Math.pow(currAge, 2);
                i++;
            }
            System.out.println(totalbuds);

            // Print actual tree for any other case
            int j = 1;
            while (j < args.length) {
                int currAge = Integer.parseInt(args[i]);
                int Os = currAge - 1;
                // outer loop for printing buds
                for(int k = 0; i < currAge; k--){
                    System.out.println();
                }
            }
        }

    }

}