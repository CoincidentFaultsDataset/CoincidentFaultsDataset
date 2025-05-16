// [IDENTIFYING INFORMATION REMOVED]

import java.util.ArrayList;

public class MagicTrees{

    public static void main(String[] args){
        int numTrees = args[0];
        ArrayList<int> treeAges = new ArrayList<int>();
        for(i = 1; i < args.size(); i++){
            treeAges.add(args[i]);
        }
        PrintTrees(numTrees, treeAges);
    }

    private void PrintTrees(int numTrees, ArrayList<int> treeAges){
        //Print for each tree
        for(i = 0; i < numTrees; i++){
            int currentTreeAge = treeAges.get(i);
            int budsForCurrentTree = GetTotalBuds(currentTreeAge);

            //Print the current tree
            for(int j = 0; j < currentTreeAge; j++){
                
            }
        }
    }

    private void CreateTree(int treeAge, int totalBuds){
        for(i = treeAge; i > 0; i--){
            
        }
    }

    private void GetTotalBuds(int treeAge){
        if(treeAge = 0){
            return 0;
        }
        else{
            int totalBuds = 2;
            for(int i = 1; i <= treeAge; i++){
                totalBuds *= 2
            }    

            return totalBuds;
        }
    }
}