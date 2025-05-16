
package lab1;
public class MagicTrees {

    public static void main(String[] args) {
        //initialize command line arguments
        int numberOfTrees = Integer.parseInt(args[0]);

        //loop for number of trees
        while (numberOfTrees > 0){
            //find number of branches of the next tree
            int numberOfBranches = Integer.parseInt(args[numberOfTrees]);

            //handles buds leaves at the top ex: "O-O-O-O"
            if (numberOfBranches > 0){
                for (int j = 1; j < Math.pow(2, numberOfBranches); j ++){
                    System.out.print("O-O-"); 
                }
                System.out.println("O-O");
            } else {
                System.out.println("O");
            }

            //handles trees or "Y"s 
            if (numberOfBranches > 0){
                int fork = 1; //use this to dictate the number of forks to use "/" or "\"
                for (int k = 0; k < numberOfBranches; k++){
                    //need equation for number of branches
                }
            }







            //leave a space underneath for the next tree to be seperate
            System.out.println("\n");
        }
    }
}