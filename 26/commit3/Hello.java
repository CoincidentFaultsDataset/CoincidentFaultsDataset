package lab1;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;

/**
 * @author [IDENTIFYING INFORMATION REMOVED]
 */
public class Hello {
    /**
     * Main method - Prints out those trees
     * Input
     * The first line will contain a single integer n: the number of trees in the specified section of the
     * forest.
     * The next line will contain n integers, indicating the age of each tree in years from the starting
     * point. Each age will be separated by a single space.
     * 0 <= n < 20
     * 0 <= age < 7
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of trees
        int n = scanner.nextInt();

        // Read the ages of the trees
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }
       scanner.close();
           
            // Print the trees
            printTrees(n, ages);
    }

/**
 * input: takes in n and ages[]
 * Output
 * The first line of the output should print the total number of growth buds in the section of the
 * forest.
 * The remaining output should display a diagram of each tree in the forest, following the
 * specification seen below. Dashes are used below for clarity—each dash should be replaced with
 * a space.
 */
// need to print growth levels, spaces, branches, connecting lines, and trunk
// 

    public static void printTrees(int n, int[] ages) {
        // Calculate total growth buds
        int totalGrowthBuds = 0;
        for (int age : ages) {
            totalGrowthBuds += Math.pow(2, age + 1); // 2^(age + 1) buds for each tree
        }

        // Print the diagram of each tree
        for (int age : ages) {
            print(n, age);
        }

        // print growth levels
        

    }


    public static void print(int n, int age) {
        // check range of both n and age and return if out of range
        if (n < 0 || n >= 20) {
            System.out.println("Invalid number of trees");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (age < 0 || age >= 7) {
                System.out.println("Invalid age of tree");
                return;
            }
        }
        //output
        int totalBuds = 0;

        String ooHs = "";
        if (n == 0) {
            ooHs = "O";
        } else if (n == 1) {
            ooHs = "O-O";
        } else {
            ooHs = "O-O";
            for (int i = 0; i < n - 2; i++) {
                ooHs += "-O";
            }
            ooHs += "-O";
        }

        System.out.println(ooHs);

    }

    // based on the input instructions there needs to be a n^age growth of buds
    // if n = 0 and 



    /**
     * Return a greeting that matches the time of day given by datetime:
     * * "Good morning" if it's after midnight and before noon
     * * "Good afternoon" if it's between noon and 5:00pm
     * * "Good evening" if it's between 5:00pm and midnight.
     * Precondition: datetime is not null.
     */
    public static String getGreeting(LocalDateTime datetime) {
        return "Good morning";
    }
}
