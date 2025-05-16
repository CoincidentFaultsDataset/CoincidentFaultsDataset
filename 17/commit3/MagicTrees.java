import java.util.Scanner;

class MagicTrees {
	public static void main(String[] args) {
		//User tree setup
		Scanner input = new Scanner(System.in);
		String stringN = input.nextLine();
		int n = Integer.parseInt(stringN);
		int treeAges[] = new int[n];
		int growthBuds[] = new int[n];
		int totalGrowthBuds = 0;

		//Setting up the age of each tree
		for(int i = 0; i < n; i++) {
			String stringAge = input.nextLine();
			treeAges[i] = Integer.parseInt(stringAge);
		}

		//Initializing growth buds
		for(int i = 0; i < treeAges.length; i++) {
			growthBuds[i] = (int) Math.pow(2, treeAges[i]);
			totalGrowthBuds += (int) Math.pow(2, treeAges[i]);
		}

		//Print out total growth buds
		System.out.println(totalGrowthBuds);
		
		//Printing out trees
		for(int i = 0; i < treeAges.length; i++) {
			
			System.out.println(growthBuds[i]);
		}
	}
} 