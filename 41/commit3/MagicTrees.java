package lab1;

import java.util.Scanner;

public class MagicTrees {
	/**
	 * Main method - prints a friendly message.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//TODO input validation for input ranges
		//TODO prevent invalid inputs
		
		int treeNumber = Integer.parseInt(input.nextLine());
		
		int[] treeAges = new int[treeNumber];
		for (int i = 0; i < treeNumber; i++) {
			treeAges[i] = Integer.parseInt(input.nextLine());
		}
		
		input.close();
		
		printBudTotals(treeAges);
		printTrees(treeAges);
	}
	
	public static void printBudTotals(int[] treeAges) {
		
		int totalBuds = 0;
		for (int i = 0; i < treeAges.length; i++) {
			totalBuds += (int) Math.pow(2, treeAges[i]);
		}
		
		System.out.println(totalBuds);
	}
	
	public static void printTrees(int[] treeAges) {
		for (int treeIndex = 0; treeIndex < treeAges.length; treeIndex++) {
			
			int buds = (int) Math.pow(2, treeAges[treeIndex]);
			int treeWidth = buds + buds - 1;
			int treeHeight = buds + 1;
			
			// Printing buds at the top
			System.out.print("O");
			for (int budIndex = 1; budIndex < buds; budIndex++) {
				System.out.print("-O");
			}
			System.out.println();
			
			
			// Printing each row of the tree down to the base branch
			int[] branchRows = new int[treeAges[treeIndex] + 1];
			branchRows[0] = 0;
			for (int branchRowIndex = 1; branchRowIndex < treeAges[treeIndex]; branchRowIndex++) {
				branchRows[branchRowIndex] = ((int) Math.pow(2, branchRowIndex)) + branchRows[branchRowIndex - 1];
			}
			
			for (int i = 0; i < branchRows.length; i++) {
				System.out.println(branchRows[i]);
			}
			
			for (int treeRow = 0; treeRow < treeHeight - 2; treeRow++) {
				
//				boolean isBranchRow = 
				
			}
			
			
			// Printing base of the tree
			for (int horizontalIndex = 0; horizontalIndex < (int) treeWidth/2; horizontalIndex++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
			
			//Line seperator
			System.out.println();
		}
	}
}