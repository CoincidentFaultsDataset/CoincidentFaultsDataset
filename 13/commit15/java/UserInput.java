import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public Integer getUserChoiceInRangeInclusive(String prompt, int low, int high){
        int n = -1;

        while ( (n < low) || (n > high) ){
            System.out.print(prompt);
            n = scanner.nextInt();
        }

        return n;
    }
    
}
