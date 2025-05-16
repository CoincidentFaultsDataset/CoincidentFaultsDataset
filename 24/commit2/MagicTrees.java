
package lab1;
public class MagicTrees {

    public static void main(String[] args) {
        //initialize command line arguments
        int numberOfTrees = Integer.parseInt(args[0]);

        //loop for number of trees
        for (int i = 1; i <= numberOfTrees; i++){
            //find number of branches of the next tree
            int NumberOfBranches = Integer.parseInt(args[i]);

            //handles buds/leaves at the top ex: "O-O-O-O"
            if (NumberOfBranches > 0){
                for (int j = 1; j < Math.pow(2, NumberOfBranches); j ++){
                    System.out.print("O-O-"); 
                }
                System.out.println("O-O");
            } else {
                System.out.println("O");
            }








            //leave a space underneath for the next tree to be seperate
            System.out.println("\n");
        }
    }
}