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
    }

    private static int calculateGrowthBuds(int age) {
        // number of growth buds
        return (int) Math.pow(2, age / 2);
    }
}