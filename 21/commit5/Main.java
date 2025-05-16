import java.util.Scanner;
import java.lang.StringBuilder;;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // implementing single age before implementing multiple ages
        int age = scan.nextInt();

        System.out.println("treenumber: " + n + " age: " + age);

        int buds = (int)Math.floor(Math.pow((double) n, (double) age));

        System.out.println("buds: " + buds);

        // while there are still trees to be made
        while (n != 0) {
            // isn't set up yet for different ages for different trees
            switch(age) {
                case 0:
                    System.out.println("O\n|\n");
                    n--;
                    break;
                case 1:
                    System.out.println("O-O\n-Y-\n-|-\n");
                    n--;
                    break;
                case 2:
                    buds = 4;
                default:
                    printTree(age, buds);
            }
            n--;
        }

    }

    public static void printTree(int treeAge, int buds) {
        int outputLength = treeAge + (treeAge - 1);
        int currentLine = 0;
        String treeLines = "";

        StringBuilder stringBuilder = new StringBuilder();
        // //int numYs = (outputLength-3) / 4;
        // for (int firstLineNum = 0; firstLineNum < (buds / 2) - 1; firstLineNum++) {
        //     treeLines += "Y---";
        // }
        // System.out.println(treeLines + "Y-");
        // currentLine++;

        // treeLines = "--";

        // for (int secondLineNum = 0; secondLineNum < (buds / 2) - 1; secondLineNum++) {
        //     treeLines += "\\-/-----";
        // }
        // System.out.println(treeLines + "\\-/--");

        // for (int j = 0; j < treeAge; j++) {
        //     for (int i = 0; i < outputLength; i++) {

        //     }

        for (int i = 0; i < buds - 1; i++) {
            treeLines += "-";
        }

        String spaceDistance = "";
        int whenToSplit = buds / 2;

        // print the tree upside-down first since it's easier to create that way
        System.out.println(treeLines + "|" + treeLines);
        System.out.println(treeLines + "Y" + treeLines);
        for (int i = buds - 2; i > 0; i--) {
            treeLines = treeLines.substring(0, i) + "\\";

            spaceDistance += "-";
            treeLines += spaceDistance;

            String reversedLine = treeLines.replaceAll("\\\\", "/");
            stringBuilder.append(reversedLine);
            stringBuilder.reverse();

            System.out.println(treeLines + stringBuilder);
            stringBuilder.setLength(0);
        }

        String budString = "";
            // print buds
            for (int i=0;i < buds - 1;i++) {
                budString += "O-";
            }
            System.out.println(budString + "O\n");
        
    }
}