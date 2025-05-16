import java.util.Scanner;

public class MagicTrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read number of trees
        int n = scanner.nextInt();

        // read ages of each tree
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }

        // calculate total number of growth buds
        int totalGrowthBuds = 0;
        for (int age : ages) {
            totalGrowthBuds += calculateGrowthBuds(age);
        }

        // print total number of growth buds
        System.out.println(totalGrowthBuds);

        // print diagram of each tree
        for (int age : ages) {
            printTree(age);
        }
    }

    private static int calculateGrowthBuds(int age) {
        // number of growth buds
        return (int) Math.pow(2, age / 2);
    }

    private static void printTree(int age) {
        // print trunk of the tree
        System.out.print("O");

        // print branches of the tree
        for (int i = 0; i < age; i++) {
            System.out.print("-Y");
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            System.out.print("\\");
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }
            System.out.print("-");
        }

        // print the top of the tree
        System.out.println("Y");
        System.out.println("|");
    }
}