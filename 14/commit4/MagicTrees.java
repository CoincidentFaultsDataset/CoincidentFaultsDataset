import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;

public class MagicTrees {
    private static int numTrees;
    private static int totalGrowthBud;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        getNumTrees(scanner);
        generateTrees(scanner);
    }

    private static void getNumTrees(Scanner scanner) {
        if (scanner.hasNext()) {
            numTrees = scanner.nextInt();
        }
    }

    public static void generateTrees(Scanner scanner) {
        while (scanner.hasNext()) {
            int currHeight = scanner.nextInt();
            totalGrowthBud += Math.pow(2, currHeight);
            if (currHeight == 0) {
                int leaves = 0;
            } else {
                int leaves = (int) Math.pow(2, currHeight - 1);
            }
        }
    }
}