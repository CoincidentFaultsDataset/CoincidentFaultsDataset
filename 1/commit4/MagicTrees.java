import java.util.Scanner;

class MagicTrees{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of trees");
        int numTrees = scanner.nextInt();
        System.out.println("Age of trees");
        int[] ages = new int[numTrees];
        for (int i = 0; i < numTrees; i++){
            int age = scanner.nextInt();
            ages[i] = age;
        }

        printTrees(ages);

        scanner.close();
    }

    public static void printTrees(int[] ages){
        int totalBuds = 0;
        for (int i = 0; i < ages.length; i++){
            if (ages[i] == 0){
                totalBuds++;
            } else {
                int treeBuds = (int) Math.pow(2,ages[i]);
                totalBuds = totalBuds + treeBuds;
            }
        }

        System.out.println(totalBuds);

        for (int i = 0; i < ages.length; i++){
            generateTree(ages[i]);
        }
    }

    public static void generateTree(int age){
        if (age == 0){
            System.out.println("O");
            System.out.println("|");
            System.out.println();
            return;
        }

        int numBuds = (int) Math.pow(2, age);

        for (int i = 0; i < numBuds; i++){
            System.out.print("O ");
        }
        System.out.println();

        for (int i = 0; i < numBuds/2; i++){
            System.out.print(" ");
        }
        System.out.println("Y");
        for (int i = 0; i < numBuds/2; i++){
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.println();
    }
}