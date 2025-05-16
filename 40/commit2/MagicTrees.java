package main.java.lab1;

import java.util.Scanner;
import java.lang.Math;

public class MagicTrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTrees = scanner.nextInt();
        double[] treeHeights = new double[numberOfTrees];
        int sum = 0;
        for (int i = 0; i < numberOfTrees; i++) {
            treeHeights[i] = scanner.nextDouble();
            sum += Math.pow(2, treeHeights[i]);
        }
        scanner.close();
        System.out.println(sum);

        // Print the leafs
        int leafs = (int) Math.pow(2, treeHeights[0]);
        for (int i = 0; i < leafs - 1; i++) {
            System.out.print("O-");
        }
        System.out.print("O\n");

        int steps = 3;
        int stems = leafs / 2;
        // Print the branches
        for (int i = 0; i < leafs - 1; i++) {
            // first dashes
            for (int j = 0; j < i + 1; j++) {
                System.out.print("-");
            }
            // Y's and rest of dashes
            for (int y = 0; y < leafs / 4; y++) {
                System.out.print('Y');
                // print dashes
                for (int j = 0; j < steps; j++) {
                    System.out.print('-');
                }
                System.out.print('Y');
            }

            // end dashes
            for (int j = 0; j < i + 1; j++) {
                System.out.print("-");
            }

            // increase our steps
            steps += 2;

            System.out.println();

        }
        System.out.println();

        // print the trunk
        for (int i = 0; i < 2 * leafs - 1; i++) {
            if (i == leafs - 1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }

    }
}