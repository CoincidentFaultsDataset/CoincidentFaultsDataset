package lab1;
import java.util.Scanner;
public class MagicTrees {
    public static void main(String[] args){
        System.out.println("Number of trees in the specified section of the forest:");
        Scanner keyboard = new Scanner (System.in);
        int numTrees = keyboard.nextInt();
        while (numTrees<0||numTrees>=20) {
            System.out.println("Error invalid number of Trees. Please slect a number between 0 and 20");
            System.out.println("Number of trees in the specified section of the forest:");
            keyboard = new Scanner (System.in);
            numTrees = keyboard.nextInt();
        }
        int[]ages=new int[numTrees];
        System.out.println("Ages of Trees:");
        int numBuds = 0;
        for(int n=0; n<=numTrees; n++){
            keyboard = new Scanner (System.in);
            int age = keyboard.nextInt();
            while(age<0||age>=7){
                System.out.println("Error invalid age. Please slect a number between 0 and 7");
                keyboard = new Scanner (System.in);
                age = keyboard.nextInt();
            }
            ages[n] = age;
            if(age%2!=0){
                numBuds +=(age*age)+1;
            }else{
                numBuds +=(age*age);
            }
        }
        System.out.println(numBuds);
        //print diagrams
    }
}
