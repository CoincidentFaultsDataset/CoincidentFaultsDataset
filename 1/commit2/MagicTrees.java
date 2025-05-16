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
                totalBuds = totalBuds + (ages[i] * ages[i]);
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
            return;
        }

        for (int i = 0; i < age*age; i++){
            System.out.print("O ");
        }


    }
}