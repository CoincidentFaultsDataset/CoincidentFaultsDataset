
import java.util.Scanner;



class MagicTrees{


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ( (n < 0) || (n >= 20) ) {
            System.out.println("Error: invalid value for n.");
            return;
        }

        String ages = sc.nextLine();

        String[] agesArr = ages.split(" ");

        /*
        for (int i=0; i < agesArr.length; i++) {
            System.out.println(agesArr[i]);
        }
        */

        if (n != agesArr.length) {
            System.out.println("Error: Mismatch between tree count and number of ages.")
        }

        int totalBuds = 0;

        for (int k=0; k < n; k++) {
            totalbuds += 2**agesArr[k];
        }
        
        System.out.println(totalBuds;)

        String bud1 = "O ";
        String bud2 = "O";


        for (int j=0; j < agesArr.length; j++) {





        }
        
    }

}