package lab1;

import java.util.Scanner;

public class MagicTrees {
    public static void main(String[] args) {
        // get input
        Scanner sc = new Scanner(System.in);
    
        int numTrees = sc.nextInt();
    
        int[] treeAges = new int[numTrees];
        int[] maxBuds = new int[numTrees];
    
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
            maxBuds[i] = localBuds / 2;
            totalBuds += localBuds;
        }
    
        // give output
        // total number of growth buds
        // WORKING
        System.out.println("Total Buds: " + totalBuds);
        
        // print a diagram of each tree
        for (int i = 0; i < numTrees; i++) {
            int treeWidth = (maxBuds[i] * 2) + 1;
            // print the leaves
            for (int j = 0; j < maxBuds[i]; j++) {
                System.out.print("O O ");
            }
            System.out.println();
    
            // in a loop print the growth buds and the branches connecting them
            for (int j = maxBuds[i]; j > 0; j /= 2) {
                for (int k = 0; k < j; i++) {

                }
            }
    
            // print the bottom


            // close scanner
            sc.close();
        }
    }
}
