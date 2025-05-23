// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.io.*;
import java.util.*;
import java.lang.Math;

// First output: add up 2^int_2 + 2^int_3
//2nd output: 

class MagicTrees {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numTrees = obj.nextInt();
        obj.nextLine();

        int[] numBuds = new int[numTrees];
        int i = 0;

        while (i < numTrees && obj.hasNextLine()) {
            numBuds[i] = obj.nextInt();
            i++;
            if (i < numTrees) {
                obj.nextLine();
            }
        }

        makeTree(numTrees, numBuds);
    }
   
    public static double makeTree(int start, int[] age) {
        double sum = 0;

        for (int i = 0; i < age.length; i++) {
            sum += Math.pow(2, age[i]);
        }
        return sum;
    }

}