import java.util.*;


public class magicTrees {
    int amount = 0;
    System.out.println("How many trees?");
    Scanner sc = new Scanner(System.in);
    amount = sc.nextInt();
    if(amount >20 ||amount <0){
        System.out.println("please imput a number from 0 to 20");
        System.exit(0);
    }
    int[] life[amount];
    for (int i=0;i<amount;i++){
        System.out.println("choose a life for tree number " + i);
        life[i] = sc.nextInt();
        if(life[i]>7||life[i]<0){
            System.out.println("Please input a number from 0 to 7");
            System.exit(0);
        }
    }
    
    for(int i = 0;i<amount; i++){
        

    }

}
