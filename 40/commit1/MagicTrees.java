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

        // print the first dashes of each coloum
        int steps = 3;
        int stems = leafs / 2;
        // Print the branches
        for (int i = 0; i < leafs - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            for (int y = 0; y < leafs * 2; y++) {
                System.out.print('Y');
                // print dashes
                for (int j = 0; j < steps; j++) {
                    System.out.print('-');
                }
            }

        }

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