import java.util.ArrayList;
import java.lang.Math;

public class Tree {
  //first branch and root are 1 long. 
  private ArrayList<String> layers;
  int width = 1;
  public Tree(int age) {
    //calculate the bud count.
    layers = new ArrayList<String>();
    
    // Add buds
    makeBuds(age);
    
    //Add each layer.
    //First add the outer layer.
    int height = 0;
    for(int i = age - 1; i > 0; i--) {
      makeLayer(age, height);
      height += 1;
    }
    makeRoot();
  }

  private void makeBuds(int age) {
    String buds = "o";
    int budCount = Math.pow(2, age);

    while(budCount > 0) {
      buds = buds + "-o";
      budCount -= 1;
      width += 1;
    }

    layers.add(buds);
  }
  private void makeRoot() {
    String root1 = "";
    String root2 = "":
    for(int i = 0; i < width / 2; i++) {
      root1 = root1 + "-";
      root2 = root2 + "-";
    }
    root = root1 + "Y";
    root2 = root2 + "|";
    for(int i = 0; i < width/2; i++) {
      root1 = root1 + "-";
      root2 = root2 + "-";
    }
    layers.add(root1);
    layers.add(root2);
  }

  private void makeLayer(String lastLayer) {
    //the width determines the size of this.
    int splitCount = Math.pow(2, age);
    String splits = "";
    for(int i = 0; i < height + 1; i++) {
      splits += "-";
    }
    for(int i = 0; i < age; i++) {
      splits += "Y";
      for(int i = 0; i < (height + 3)
    }
  }
}
