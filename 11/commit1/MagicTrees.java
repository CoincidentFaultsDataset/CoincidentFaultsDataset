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
            //Print the current tree
            for(int j = 0; j < currentTreeAge; j++){
                
            }
        }
    }

    private void PrintTotalBuds(ArrayList<int> treeAges){

    }
}