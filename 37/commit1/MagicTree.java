package lab1;

import java.util.Scanner;

/**
 * @author [IDENTIFYING INFORMATION REMOVED]
 */
class MagicTree {

    public static void main(String[] args) {
        System.out.println("test");
        
        Scanner sc = new Scanner(System.in);

        String numOfTreesString =  sc.nextLine();
        String nString =  sc.nextLine();
        String ageString  = sc.nextLine();
        
        System.out.println("done");

        int numOfTrees = Integer.parseInt(numOfTreesString);
        int n = Integer.parseInt(nString);
        int age = Integer.parseInt(ageString);

        System.out.println(numOfTrees);
    }

}
