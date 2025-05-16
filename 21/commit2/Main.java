import java.util.Scanner;

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
            String budString = "";
            // print buds
            for (int i=0;i < buds - 1;i++) {
                budString += "O-";
            }
            System.out.println(budString + "O");

            // print leaves
            if (age == 0) {
                System.out.println("|\n");
                n--;
                continue;
            }

            if (age == 1) {
                System.out.println("-Y-\n-|-\n");
                n--;
                continue;
            }

            int outputLength = age + (age - 1);
            int currentLine = 0;
            String treeLines = "-";
            String branchLines = "--";

            int numYs = (outputLength-3) / 4;
            for (int firstLineNum = 0; firstLineNum < (outputLength / 2) - 1; firstLineNum++) {
                treeLines += "Y---";
            }
            System.out.println(treeLines + "Y-");
            currentLine++;

            for (int j = 0; j < age; j++) {
                for (int i = 0; i < outputLength; i++) {

                }
            }
            n--;
        }
    }
}