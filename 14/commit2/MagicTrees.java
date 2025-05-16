import java.io.File;
import java.util.Scanner;

public class MagicTrees {
    private int numTrees;
    private int totalGrowthBud;

    public static void main(String[] args) {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        getNumTrees(scanner);

    }

    private static void getNumTrees(Scanner scanner) {
        this.numTrees = scanner.nextInt();
    }

    public static
}