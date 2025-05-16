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
            numGrowthBuds += (num * num);
            sizes[counter] = num;
            counter++;
        }

        // print out the number of growth buds
        System.out.println(numGrowthBuds + "\n");
        
        // loop the amount of trees that you are going to print
        for(int i = 0; i < numItems; i++) {
            int size = sizes[i];

            // print out first line
            System.out.print("0");
            for(int j = 0; j < (size * size) - 1; j++) {
                System.out.print("-0");
            }
            System.out.println();

            // print out the last line
            for(int last = 0; last < size; last++) {
                System.out.print("-");
            }
            System.out.print("|");
            for(int last = 0; last < size; last++) {
                System.out.print("-");
            }

            System.out.println("\n");
        }


    }
}