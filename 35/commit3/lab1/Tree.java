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
    makeLayer(layers.get(0) 
    makeRoot();
  }

  private void makeBuds(int age) {
    String buds = "o";
    int budCount = Math.pow(2, age);

    while(budCount > 0) {
      buds = buds + "-o";
      budCount -= 1;
      TreeDisplay.budCount += 1;
      width += 2;
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

  private int makeLayer(String lastLayer) {
    //simple rules for this.
    //if the character is an o, and the last character
    //is null or not Y, insert a -Y-, otherwise add -.
    String thisLayer = "";
    int counter = 0;
    char lastChar = " ";
    bool even = true;
    int yCount = 0;
    while(counter < width) {
      if(lastLayer.charAt(counter) == 'o') {
        if(lastChar = 'Y') {
          thisLayer = thisLayer + "-";
          lastChar = '-';
        } else {
          thisLayer = thisLayer + "-Y-";
          yCount += 1;
          lastChar = 'Y';
        }
        counter += 2;
      }

      if(lastLayer.charAt(counter) == '-') {
        if(!even && lastLayer.charAt(counter + 1) == 'Y') {
          thisLayer = thisLayer + "/-";
          counter += 2;
        } else if(!even && lastLayer.charAt(counter + 1) == '/') {
          thisLayer = thisLayer + "/-";
          counter += 2;
        } else {
          thisLayer = thisLayer + "-";
          counter += 1;
        }
      }

      if(lastLayer.charAt(counter) == 'Y') {
        if(even) {
          thisLayer = thisLayer + "-\\";
          counter += 2;
          even = false;
        } else {
          thisLayer = thisLayer + "/"
        }
      }

      if(lastLayer.charAt(counter) == '\\') {
        //check for \-/ pattern.
        if(lastLayer.charAt(counter + 2) == '/') {
          thisLayer = thisLayer + "-Y-";
          yCount += 1;
          counter += 3;
        }
      }
    }
    
    layers.add(thisLayer);

    if(yCount != 1) {
      makeLayer(thisLayer);
    }
    return yCount;
  }
}
