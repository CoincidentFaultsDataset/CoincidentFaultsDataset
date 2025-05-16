import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class MagicTrees {

    public static void main(String[] args) {
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            int numOfTrees = Integer.parseInt(myReader.nextLine());
            int treeAges[];
            treeAges = new int[numOfTrees];
            for(int i = 0; i < numOfTrees; i++){
                treeAges[i] = Integer.parseInt(myReader.nextLine());
            }
            myReader.close();
            MakeTrees(numOfTrees, treeAges);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }

    static void MakeTrees(int treeCount, int[] treeAges){
        int totalBuds = 0;
        for(int i = 0; i < treeCount; i++){
            totalBuds += treeAges[i] * treeAges[i];
        }
        System.out.println(totalBuds);
        for(int i = 0; i < treeCount; i++){
            MakeTree(treeAges[0]);
        }
    }

    static void MakeTree(int age){
        String budsStr = "O";
        for(int i = 0; i < (age*age) - 1; i++){
            
            budsStr += "-O";
        }

        System.out.println(budsStr);
        int curLine = 0;
        for(int i = age; i > 0; i--){
            
        }

    }
}