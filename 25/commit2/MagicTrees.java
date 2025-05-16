import java.util.*;

public class MagicTrees {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // used to keep track of each input
        int counter = 0;

        // get the first input which is the number of trees
        int numItems = input.nextInt();
        int[] sizes = new int[numItems];
        int numGrowthBuds = 0;

        // loop the number of trees times to get the sizes of the rest of the trees
        while(counter < numItems) {
            int num = input.nextInt();
            numGrowthBuds += ((num * num) + 1);
            sizes[counter] = num;
            counter++;
        }

        System.out.println();

        // print out the number of growth buds
        System.out.println(numGrowthBuds + "\n");
        
        // loop the amount of trees that you are going to print
        for(int i = 0; i < numItems; i++) {
            int checkOdd = 0;
            int size = sizes[i];
            if(size > 1 && size % 2 == 1) {
                checkOdd = 1;
            }

            // print out first line
            System.out.print("0");
            for(int j = 0; j < (size * size) - checkOdd; j++) {
                System.out.print("-0");
            }
            System.out.println();

            // print out the last line
            for(int last = 0; last < ((size * size) - 1); last++) {
                System.out.print("-");
            }
            System.out.print("|");
            for(int last = 0; last < ((size * size) - 1); last++) {
                System.out.print("-");
            }

            System.out.println("\n");
        }


    }
}