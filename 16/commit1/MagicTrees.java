import java.util.Scanner;

public class MagicTrees {
    public static void main(String[] args) {
        // get input
        Scanner sc = new Scanner();
    
        int numTrees = sc.nextInt();
    
        int[] treeAges = new int[numTrees];
    
        for (int i = 0; i < numTrees; i++) {
            treeAges[i] = sc.nextInt();
        }
    
        // build tree
        int totalBuds = 0;
        int localBuds = 0;
    
        for (int i = 0; i < numTrees; i++) {
            localBuds = 1;
            for (int j = 0; j < treeAges[i]; j++) {
                localBuds *= 2;
            }
            totalBuds += localBuds;
        }
    
        // give output
        // total number of growth buds
        System.out.println("Total Buds: " + totalBuds);
        
        // print a diagram of each tree
        for (int i = 0; i < numTrees; i++) {
            // print the leaves
            for (int j = 0; j < treeAges[i]; j++) {
                System.out.print("O O ");
                System.out.println();
            }
    
            // in a loop print the growth buds and the branches connecting them
            for (int j = treeAges[i]; j > 0; j++) {
                // System.out.print();
            }
    
            // print the bottom
        }
    }
}
