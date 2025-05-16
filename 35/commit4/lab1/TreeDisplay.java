import java.util.ArrayList;

public class TreeDisplay {
  public static int budCount = 0;

  public static void main(String[] args) {
    int forestSize = Integer.parseInt(args[0]);
    ArrayList<Tree> trees = new ArrayList<Tree>();    
    for(int i = 0; i < forestSize; i++) {
      trees.add(new Tree(Integer.parseInt(args[i + 1])));
    
    }

    System.out.println(budCount);
    for(int i = 0; i < forestSize; i++) {
      trees.get(i).printTree();
      System.out.print("\n");
    }
  }
}
