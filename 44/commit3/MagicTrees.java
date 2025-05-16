package lab1;

public class MagicTrees {

    public static void main(String[] args){
        System.out.println(calculateBuds(args));

    }
    public static int calculateBuds(String[] args){
        int totalBuds = 0;
        for (int i = 0; i < args[0]; i++){
            if (args[i+1]>1){
                int currentBuds = 2;
                for (int j = 1; j < args[i+1]; j++){
                    currentBuds = currentBuds*2; 
                }
                totalBuds = totalBuds + currentBuds;
            }else if (args[i+1]= 1){
                
            }
        }
        return totalBuds;
    }
}
