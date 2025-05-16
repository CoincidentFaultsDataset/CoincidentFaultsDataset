package lab1;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author studentname
 */
public class Hello {
    /**
     * Main method - prints a friendly message.
     */
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of trees");
        // int num_trees = sc.nextInt();
        // System.out.println("Enter ages of trees");
        // String age = sc.nextLine();
        // String[] ages = age.split("\\s+"); 
        // for (String age_str : ages) {
        //     System.out.println(age_str);
        // }

        build_magic_tree(3);
    }

    public static void build_magic_tree(int age) {
        double num_buds = Math.pow(2, age);
        int board_size = (num_buds * 2) - 1;
        for (int i = 0; i < num_buds; i++){
            System.out.print("O ");
        }
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
