package lab1;

import java.util.Scanner;

public class MagicTrees {
	/**
	 * Main method - prints a friendly message.
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int treeNumber;
		int[] treeAges;
		
		try {
			treeNumber = Integer.parseInt(input.nextLine());
			
			if (treeNumber < 0 || treeNumber > 19)
				throw new Exception();
			
		} catch (Exception e) {
			System.out.println("ERROR: Number of trees must be between 0 and 19 (inclusive)");
			input.close();
			return;
		}
		
		try {
			treeAges = new int[treeNumber];
			
			for (int i = 0; i < treeNumber; i++) {
				treeAges[i] = Integer.parseInt(input.nextLine());
				
				if (treeAges[i] < 0 || treeAges[i] > 6)
					throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("ERROR: Tree age must be between 0 and 6 (inclusive)");
			input.close();
			return;
		}
		
		input.close();
		
		printBudTotals(treeAges);
		printTrees(treeAges);
	}
	
	/**
	 * Prints the total number of buds across all trees to the console.
	 * The number of buds for one tree is 2^(tree age)
	 * 
	 * @param treeAges Array of all of the trees and their ages
	 */
	public static void printBudTotals(int[] treeAges) {
		
		int totalBuds = 0;
		for (int i = 0; i < treeAges.length; i++) {
			totalBuds += (int) Math.pow(2, treeAges[i]);
		}
		
		System.out.println(totalBuds);
	}
	
	/**
	 * Prints all tree structures to the console.
	 * 
	 * @param treeAges Array of all of the trees and their ages
	 */
	public static void printTrees(int[] treeAges) {
		for (int treeIndex = 0; treeIndex < treeAges.length; treeIndex++) {
			
			int buds = (int) Math.pow(2, treeAges[treeIndex]);
			int treeWidth = buds + buds - 1;
			int treeHeight = buds + 1;
			
			
			// Printing buds at the top
			System.out.print("O");
			for (int budIndex = 1; budIndex < buds; budIndex++) {
				System.out.print(" O");
			}
			System.out.println();
			
			
			// Trees that have must have more than 1 bud to have a branched structure
			if (buds > 1) {
				// Finding the rows that branch characters will occur on
				int[] branchRows = new int[treeAges[treeIndex]];
				branchRows[0] = 0;
				for (int branchRowIndex = 1; branchRowIndex < treeAges[treeIndex]; branchRowIndex++) {
					branchRows[branchRowIndex] = ((int) Math.pow(2, branchRowIndex)) + branchRows[branchRowIndex - 1];
				}
	
				
				// Printing each row of the tree down to the base branch
				boolean isBranchRow;
				int branchRowIndex = 0;
				int innerBranchSpacing = ((int) Math.pow(2, branchRowIndex + 1)) - 1;
				int outerBranchSpacing = ((int) Math.pow(2, branchRowIndex + 1)) - 1;
				boolean isBetweenBranches;
				for (int treeRow = 0; treeRow < treeHeight - 2; treeRow++) {
					
					// Determines if the current row is a branch row (where only Y's occur)
					if (treeRow == branchRows[branchRowIndex]) {
						isBranchRow = true;
						branchRowIndex++;
					} else {
						isBranchRow = false;
					}
					
					// Printing left padding for the tree
					for (int leftPaddingIndex = 0; leftPaddingIndex < treeRow + 1; leftPaddingIndex++) {
						System.out.print(" ");
					}
	
					// Determining spacing between branches
					if (isBranchRow) {
						innerBranchSpacing = ((int) Math.pow(2, branchRowIndex + 1)) - 1;
						outerBranchSpacing = ((int) Math.pow(2, branchRowIndex + 1)) - 1;
					} else {
						innerBranchSpacing -= 2;
						outerBranchSpacing += 2;
					}
					
					// Printing out characters for each row
					isBetweenBranches = false;
					for (int rowCharIndex = 0; 
							rowCharIndex < ((int) Math.pow(2, branchRows.length - branchRowIndex));
							rowCharIndex++) {
						
						// Printing out characters for rows that are branch points
						if (isBranchRow) {
							System.out.print("Y");
							for (int betweenPadding = 0; betweenPadding < innerBranchSpacing; betweenPadding++) {
								System.out.print(" ");
							}
							
						// Printing out characters for rows that are not branch points, the inner if-statement
						// determines if on the left/right branch (outside/inside parent branch point)
						} else {
							if (!isBetweenBranches) {
								System.out.print("\\");
								for (int betweenPadding = 0; betweenPadding < innerBranchSpacing; betweenPadding++) {
									System.out.print(" ");
								}
								isBetweenBranches = true;
								
							} else {
								System.out.print("/");
								for (int betweenPadding = 0; betweenPadding < outerBranchSpacing; betweenPadding++) {
									System.out.print(" ");
								}
								
								isBetweenBranches = false;
							}	
						}
					}
					
					System.out.println();
				}
			}
			
			
			// Printing base of the tree
			for (int horizontalIndex = 0; horizontalIndex < (int) treeWidth/2; horizontalIndex++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
			
			//Line separator
			System.out.println();
		}
	}
}