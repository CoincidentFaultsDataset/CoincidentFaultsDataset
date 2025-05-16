import java.util.Scanner;

public class MagicTrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("o");
        
        try {
            int n = Integer.parseInt(scanner.nextLine());
            int totalBuds = 0;
            
            for (int i = 0; i < n; i++) {
                try {
                    int age = Integer.parseInt(scanner.nextLine());
                    totalBuds += age * age;
                    createTree(age, sb);
                    sb.append(System.lineSeparator());
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid int");
                    return;
                }
            }
            
            System.out.println(totalBuds);
            System.out.println(sb.toString());
        } catch (NumberFormatException e) {
            System.out.println("Not a valid int");
        }
    }
    
    private static void createTree(int age, StringBuilder sb) {
        for (int i = 0; i < age * age; i++) {
            sb.append(" o");
        }
    }
}