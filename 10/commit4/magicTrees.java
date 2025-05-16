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
        int size = 2^life[i];
        for(int j = 0; j<size; j++){
            for(int k = 0; k<(2*size)-1;k++){
                if(j = 0){
                    if(2%k = 0){
                        System.out.print("O");
                    }else{
                        System.out.print(" ");
                    }
                }
                if(j+1 = 2^){

                }
            }
            System.out.println();
        }
        for(int j = 0;j<(2*size)-1;j++){
            if(j = size){
                System.out.print("|");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
