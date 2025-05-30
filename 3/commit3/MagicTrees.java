import java.io;
java.util import;
import java.lang.Math;

// First output: add up 2^int_2 + 2^int_3
//2nd output: 

public class MagicTrees {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numTrees = obj.nextInt()
        obj.nextLine();

        int[] numBuds;
        int i = 0;

        while (obj.hasNextLine()) {
            obj.nextInt() = numBuds[i];
            i++;
            String currLine = obj.nextLine();
        }

        makeTree(numTrees, numBuds)
    }
   
    public String makeTree(int start, int[] age) {
        int sum;

        for (int i = 0; i < age.length(); i++) {
            sum += Math.pow(2, age[i]);
        }
        System.out.println(sum);
    }

}