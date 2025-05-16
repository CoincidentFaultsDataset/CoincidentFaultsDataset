// [IDENTIFYING INFORMATION REMOVED]

import java.util.ArrayList;

public class MagicTrees{

    public static void main(String[] args){
        //int numTrees = args[0];
        /*ArrayList<int> treeAges = new ArrayList<int>();
        for(i = 1; i < args.size(); i++){
            treeAges.add(args[i]);
        }*/

        int numTrees = 1;
        ArrayList<Integer> treeAges = new ArrayList<Integer>();
        treeAges.add(1);

        PrintTrees(numTrees, treeAges);
    }

    private static void PrintTrees(int numTrees, ArrayList<Integer> treeAges){
        //Print for each tree
        for(int i = 0; i < numTrees; i++){
            int currentTreeAge = treeAges.get(i);
            int budsForCurrentTree = GetTotalBuds(currentTreeAge);
            
            System.out.println(budsForCurrentTree);
            PrintTree(currentTreeAge, budsForCurrentTree);
        }
    }

    private static void PrintTree(int treeAge, int totalBuds){
        int branchesInCurrentLevel = totalBuds/2;
        for(int i = treeAge; i > 0; i--){
            for(int j = 1; j <= totalBuds; j++){
                //Print the upper bud level
                if(i == treeAge){
                    if(j == totalBuds){
                        System.out.println("O");
                    }
                    else{
                        System.out.print("O-");
                    }
                }
                //Print all other levels
                else{
                    if(j == 0 || j == totalBuds){
                        System.out.print("-");
                    }
                    if(j == )
                }
            }
            
        }
    }

    private static int GetTotalBuds(int treeAge){
        if(treeAge == 0){
            return 0;
        }
        else{
            int totalBuds = 1;
            for(int i = 0; i < treeAge; i++){
                totalBuds *= 2;
            }    

            return totalBuds;
        }
    }
}