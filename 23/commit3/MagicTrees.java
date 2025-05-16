package lab1;

import java.util.*;

public class MagicTrees {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalTrees = scan.nextInt();
		ArrayList<Integer> treeAges = new ArrayList<>();
		
		//figure out how to break this
		//while(scan.hasNextInt()) {
			treeAges.add(scan.nextInt());
		//}
		
			//maps all trees to its growthNodes;
		int[][] forest = new int[2][treeAges.size()];
		int totalNodes = 0;
		for (int i = 0; i < treeAges.size(); i++) {
			forest[0][i] = treeAges.get(i);
			forest[1][i] = (int)Math.pow(2, treeAges.get(i));
			totalNodes += forest[1][i];
		}
		
		System.out.println("Total Nodes: " + totalNodes); //remove text
			
		for (int tree : treeAges) {
			//System.out.println(tree);
			double growthNodes = Math.pow(2, tree);
			double counter = growthNodes;
			//System.out.println(growthNodes);
			
			//first line
			while (counter > 1) {
				System.out.print("O ");
				counter--;
			}
			System.out.println("O");
			//first line end
			
			//body
			int lineNumber = 1;
			for (int i = 0; i < lineNumber; i++) {
				System.out.print(" ");
			}
			System.out.println();
			//body end
			
			//last line
			for (int i = 0; i < (growthNodes/2); i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int i = 0; i < (growthNodes/2); i++) {
				System.out.print(" ");
			}
		}
		
		//System.out.println(treeAges);
		
		
		
		scan.close();
	}
	
}
