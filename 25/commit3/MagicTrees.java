import java.util.*;
import java.lang.Math;

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

            // for even (maybe can chang the < .... to even or odd)
            // print out first line
            System.out.print("0");
            for(int j = 1; j < (size * size); j++) {
                System.out.print("-0");
            }
            System.out.println();

            // print out the middle
            for(int mid = 1; mid < (size * size); mid++) {
                // print out starting "-"
                for(int mid1 = 0; mid1 < mid+1; mid1++) {
                    System.out.print("-");
                }
                // print out "y"
                double check = (mid1 * mid1)
                if((mid1 * mid1) )

            }

            // print out the last line
            for(int last = 1; last < (size * size); last++) {
                System.out.print("-");
            }
            System.out.print("|");
            for(int last = 1; last < (size * size); last++) {
                System.out.print("-");
            }

            System.out.println("\n");
        }


    }
}