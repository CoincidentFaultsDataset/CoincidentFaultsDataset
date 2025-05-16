package lab1;

import java.util.Scanner;

/**
 * @author [IDENTIFYING INFORMATION REMOVED]
 */
public class MagicTree {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String numOfTreesString =  sc.nextLine();
        String nString =  sc.nextLine();
        String ageString  = sc.nextLine();

        int numOfTrees = Integer.parseInt(numOfTreesString);
        int n = Integer.parseInt(nString);
        int age = Integer.parseInt(ageString);

        double numOfLeafs = Math.pow((double)numOfTrees, (double)age);
        System.out.println("double num of leafs" + numOfLeafs);
        System.out.println("numOfLeafs casted as int " + (int) numOfLeafs);
        System.out.print("o");
        for (int i = 0; i < (int) numOfLeafs - 1; i++) {
            System.out.print("-o");
        }
        System.out.println("");
    }

}
