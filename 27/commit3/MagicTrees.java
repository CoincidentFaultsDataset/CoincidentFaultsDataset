import java.util.Scanner;

public class MagicTrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buds = 0;
        int numTrees = scanner.nextInt();

        for (int i = 0; i < numTrees; i++) {
            int age = scanner.nextInt();
            if (numTrees < 0 || numTrees > 20) {
                return;
            }
    
            if (age < 0 || age > 6) {
                return;
            }
            buds += 4 * age;
            printTree(age);
        }
    }

    public static void printTree(int age) {
        for (int i = 0; i < age; i++) {
            if (age == 1) {
                System.out.print("O-O");
            } else if (i > 0 || i == age - 1){
                System.out.print ("-O-O-O-O");
            } else {
                System.out.print("O-O-O-O");
            }
        }
        System.out.println();
    }
}
