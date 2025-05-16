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
     */
    public static void main(String[] args) {

        String number;
        String plantAge;

        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }

        

        number = args[1];
        plantAge = args[2];

        int n = Integer.parseInt(number); 
        int age = Integer.parseInt(plantAge); 

        printTrees(n, age);


    }

/**
Input
The first line will contain a single integer n: the number of trees in the specified section of the
forest.
The next line will contain n integers, indicating the age of each tree in years from the starting
point. Each age will be separated by a single space.
0 <= n < 20
0 <= age < 7

Output
The first line of the output should print the total number of growth buds in the section of the
forest.
The remaining output should display a diagram of each tree in the forest, following the
specification seen below. Dashes are used below for clarity—each dash should be replaced with
a space.
 */

    public static void printTrees(int n, int age) {
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
