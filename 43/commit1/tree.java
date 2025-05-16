import java.lang.Math;

public class tree {
    /* ASSUMPTIONS
     * args[1] is n
     * args[2] is age
     */

    public static void printTree(int age) {
        // 2^age is the num of O at the bottom and the width
        int leaves = (int) Math.pow(2, age);
        int width = leaves + (leaves - 1) - 2;  // the widith of O including the - between them (NOT INCLUDING ENDS)

        printLeaves(leaves);
        printY(width, 3);  // topmost level to be printed
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
    public static void printY(int width, int level) {

    }

    public static void main(String[] args) {
        int numTree = Integer.parseInt(args[0]);  // find the amount of trees to print
        // print each tree to the given size
        for (int i = 1; i < numTree + 1; i++) {
            printTree(Integer.parseInt(args[i]));
        }
    }
}