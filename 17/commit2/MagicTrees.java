import java.util.Scanner;

class MagicTrees {
	public static void main(String[] args) {
		//User tree setup
		Scanner input = new Scanner(System.in);
		String stringN = input.nextLine();
		int n = Integer.parseInt(stringN);
		int treeAges[] = new int[n];
		int growthBuds = 0;

		//Setting up the age of each tree
		for(int i = 0; i < n; i++) {
			String stringAge = input.nextLine();
			treeAges[i] = Integer.parseInt(stringAge);
		}
		
	}
} 