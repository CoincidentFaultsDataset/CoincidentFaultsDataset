import java.lang.Math;

public class tree {
    /* ASSUMPTIONS
     * args[1] is n
     * args[2] is age
     */

    public static void printTree(int age) {
        // 2^age is the num of O at the bottom and the width
        double leaves = Math.pow(2, age);
        double width = leaves + (leaves - 1);  // the widith of O including the - between them

        printLeaves(leaves);
        // loop then and change lines:1 to increase, age decrease
        int line = 1;
        for (int i = 0; i < age; i++) {
            printY(width, line, age-i -1);
            line =+ line;
            line =+ 1;
        }
        // printY(width, 1, age-1);  // topmost level to be printed
        // printY(width, 3, age-2);  // next Y to print
        // need some type of tracker to track how many dashes between Y's
        // Y is the midpoint of width between the 2 children Y's
    }

    // helper: prints the children
    public static void printLeaves(double leaves) {
        for(int i = 0; i < leaves-1; i++) {
            System.out.print("O-");
        }
        System.out.print("O\n");
    }

    // helper: prints the splits
    public static void printY(double width, double line, double age) {
        double numY = Math.pow(2, age);
        double linewidth = width - 2*line;
        int dash = (int) (linewidth - numY) / (int) (numY-1);
        
        // double + 1 of the last branches -- between them
        // for the num of Y to print
        // 13 spots, 3 -- between each Y, 4 Y

        // print left edge
        for (int i = 0; i < line; i++) {
            System.out.print("-"); 
        }
        // print main part of tree
        for (int i = 0; i < numY-1; i++) {
            System.out.print("Y");
            // print the right amount of -
            for (int j = 0; j < dash; j++) {
                System.out.print("-");
            }
        }
        System.out.print("Y");
        // print right edge
        for (int i = 0; i < line-1; i++) {
            System.out.print("-"); 
        }
        System.out.print("-\n");
    }

    // TODO
    // helper: prints the / \
    public static void printSlash(double width, double line, double age) {
        return;
    }

    public static void main(String[] args) {
        int numTree = Integer.parseInt(args[0]);  // find the amount of trees to print
        // print each tree to the given size
        for (int i = 1; i < numTree + 1; i++) {
            printTree(Integer.parseInt(args[i]));
        }
    }
}