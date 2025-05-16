/* Name: [IDENTIFYING INFORMATION REMOVED]
 * 
 * MagicTrees asks the user for a number of trees,
 * and their ages, and then prints them to the
 * screen according to given specifications 
 * with its helper methods.
 */

import java.util.Scanner;

class MagicTrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int trees = scan.nextInt();
        int[] ages = new int[trees];
        for (int i = 0; i < trees; i++) {
            ages[i] = scan.nextInt();
        }

        int buds = 0;
        // calculates total buds in forest
        for (int i = 0; i < ages.length; i++) {
            buds+=1*Math.pow(2, ages[i]);
        }

        System.out.println(buds);

        // prints all trees, with spaces inbetween
        for (int i = 0; i < ages.length; i++) {
            printTree(ages[i]);
            if (i != ages.length-1) System.out.println();
        }

        scan.close();
    }

    // handles the printing of the entire tree
    public static void printTree(int age) {
        int buds = (int) (1*Math.pow(2, age));
        if (buds > 2) {
            printBuds(buds);
            printMiddle(buds/2, 3, 1);
        } else if (buds == 2) {
            System.out.println("O-O");
        } else {
            System.out.println("O");
        }
        
        // prints secon to last line with Y
        if (buds > 1) {
            for (int i = 0; i <= (buds-1)*2; i++) {
                if (i == buds-1) {
                    System.out.print("Y");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        // prints final line
        for (int i = 0; i <= (buds-1)*2; i++) {
            if (i == buds-1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }

        System.out.println();
    }

    // prints the buds at the top of the tree
    public static void printBuds(int buds) {
        for (int i = 0; i < buds-1; i++) {
            System.out.print("O-");
        }
        System.out.println("O");
    }

    // prints everything between the head and the buds via recursion
    public static void printMiddle(int numy, int spacing, int padding) {  
        for (int i = 0; i < padding; i++) {
            System.out.print("-");
        }

        for (int i = 0; i < numy-1; i++) {
            System.out.print("Y");
            for (int j = 0; j < spacing; j++) {
                System.out.print("-");
            }
        }

        System.out.print("Y");
        for (int i = 0; i < padding; i++) {
            System.out.print("-");
        }

        System.out.println();

        padding++;
        printCascadingLines(spacing, padding, numy);

        if (numy/2>1) {
            printMiddle(numy/2, spacing*2+1, padding+1*(padding-1));
        }
    }

    // prints the lines between the y
    public static void printCascadingLines(int spacing, int padding, int numy) {
        int antiSpacing = spacing;
        for (int repetitions = padding-1; repetitions > 0; repetitions--) {
            for (int i = 0; i < padding; i++) {
                System.out.print("-");
            }
    
            for (int i = 0; i < numy/2; i++) {
                System.out.print("\\");
                for (int j = 0; j < spacing-2; j++) {
                    System.out.print("-");
                }
                System.out.print("/");
                if (i != numy/2-1) {
                    for (int k = 0; k < antiSpacing+2; k++) {
                        System.out.print("-");
                    }
                }   
            }
    
            for (int i = 0; i < padding; i++) {
                System.out.print("-");
            }
    
            System.out.println();
            padding++;
            spacing-=2;
            antiSpacing+=2;
        }
    }
}