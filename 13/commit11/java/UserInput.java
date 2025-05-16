import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public Integer setNumTreeInForest(){

        int n = -1;

        while ( (n < 0) || (n >= 20) ){
            System.out.print("How many trees in the forest? (0-20): ");
            n = scanner.nextInt();
        }

        
        return n;
    }

    //TODO: maybe merge both input methods into one method that accepts the bounds as arguments?
    public Integer setAge(int treeNum){

        int age = -1;

        while ( (age < 0) || (age >= 7) ){
            System.out.print("Age of tree " + treeNum + "? (0-7): ");
            age = scanner.nextInt();
        }

        
        return age;
    }
    
}
