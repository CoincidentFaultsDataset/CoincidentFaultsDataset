package lab1;

import java.util.Scanner;

public class MagicTrees {
    /**
    * Main method - Prints out those trees
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ages[];
        int n = 0;
        try {
            // Read the number of trees
            n = Integer.parseInt(scanner.nextLine().trim());

            // Validate the number of trees (0 <= n < 20)
            if (n < 0 || n >= 20) {
                System.out.println("Invalid number of trees. 0 <= n < 20");
                return;
            }

            // Read the ages of the trees
            ages = new int[n];
            String[] ageStrings = scanner.nextLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                ages[i] = Integer.parseInt(ageStrings[i]);
                // Validate each tree age (0 <= age < 7)
                if (ages[i] < 0 || ages[i] >= 7) {
                    System.out.println("Invalid tree age. 0 <= age < 7");
                    return;
                }
            }
        } finally {
            scanner.close();
        }

        // Calculate total growth buds
        int totalGrowthBuds = 0;
        for (int age : ages) {
            totalGrowthBuds += Math.pow(2, age);
        }
        System.out.println();
        System.out.println(totalGrowthBuds);

        int depth = 0;
        int age = 0;
        int buds = 0;
        // print the number of trees (n) and the ages of the trees
        for (int i = 0; i < n; i++) {
            age = ages[i];
            buds = (int) Math.pow(2, age);
            depth = buds;
            printTop(age, buds);
            // there will be buds - 1 middle layers
            printMiddle(age, buds - 1, depth - 1);
            printTrunk(age, buds);
            System.out.println();
        }
    }

    public static void printTop(int age, int buds) {
        // top level of tree
        if (age == 0) {
            System.out.println("0");
        } else {
            // prints out O- for bud - 1 times
            System.out.println("O-".repeat(buds - 1) + "O");
        }
    }

    public static void printTrunk (int age, int buds) {
        // true base base
        if (age == 0) {
            System.out.println("|");
            return;
        } else {
            int finalDashes = (int) Math.pow(2, age) - 1;
            System.out.println("-".repeat(finalDashes) + "|" + "-".repeat(finalDashes));
        }
    }

    /**
     * Print the middle layers
    */ 
    public static void printMiddle(int age, int buds, int depth) {
        // base case, do not print anything
        if (buds == 0 && age == 0) {
            return;
        }

        // middle layers of tree with Y and slashes.
        if (depth > 0) {
            System.out.println("-Y".repeat(buds) + "-");
            depth--;
            printMiddle(age, buds, depth);
        }
    }
}
