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
        // loop then and change -1 to increase and have levels (based on age) decrease 
        printY(width, 1, age);  // topmost level to be printed
        // need some type of tracker to track how many dashes between Y's
        // Y is the midpoint of width between the 2 children Y's
    }

    // helper: prints the children
    public static void printLeaves(int leaves) {
        for(int i = 0; i < leaves-1; i++) {
            System.out.print("O-");
        }
        System.out.print("O\n");
    }

    // width does NOT include the - - on the end
    public static void printY(double width, double line, double age) {
        double numY = Math.pow(age-1);

        double linewidth = age - 2 * line;
        // double + 1 of the last branches -- between them
        // for the num of Y to print
        // 13 spots, 3 -- between each Y, 4 Y
        // print left edge
        for (int i = 0; i < linewidth; i++) {
            System.out.print("-"); 
        }
        // print main part of tree
        //for () {

        // }
        // print right edge
        for (int i = 0; i < linewidth; i++) {
            System.out.print("-\n"); 
        }
    }

    public static void main(String[] args) {
        int numTree = Integer.parseInt(args[0]);  // find the amount of trees to print
        // print each tree to the given size
        for (int i = 1; i < numTree + 1; i++) {
            printTree(Integer.parseInt(args[i]));
        }
    }
}