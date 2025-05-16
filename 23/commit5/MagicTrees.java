package lab1;

import java.util.*;

public class MagicTrees {
	
	public static double logBase(double base, double n) {
		return Math.log(n) / Math.log(base);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalTrees = scan.nextInt();
		ArrayList<Integer> treeAges = new ArrayList<>();
		
		for (int i = 0; i < totalTrees; i++) {
			treeAges.add(scan.nextInt());
		}
					
		//maps all trees to its growthNodes;
		int[][] forest = new int[2][treeAges.size()];
		int totalNodes = 0;
		for (int i = 0; i < treeAges.size(); i++) {
			forest[0][i] = treeAges.get(i);
			forest[1][i] = (int)Math.pow(2, treeAges.get(i));
			totalNodes += forest[1][i];
		}
		
		System.out.println(totalNodes);
			
		for (int tree : treeAges) {
			int growthNodes = (int)Math.pow(2, tree);
			int counter = growthNodes;
			
			while (counter > 1) {
				System.out.print("O ");
				counter--;
			}
			System.out.println("O");
			
			int lineNumber = 1;
			int spacing = 0;
			int yCount = 0;
			for (int j = growthNodes; j > 1; j--) {
				int middleSpacing = growthNodes - 0; //fix
				for (int i = 0; i < lineNumber; i++) {
					System.out.print(" ");
				}
			
			double yLog = logBase(2, (lineNumber + 1));
			if (yLog % 1 == 0) {
				yCount = (int)(growthNodes / Math.pow(2, yLog));
				for (int i = 0; i < (yCount - 1); i++) {
					System.out.print("Y");
					spacing = (int)(Math.pow(2, yLog + 1) - 1);
					for (int k = 0; k < spacing; k++) {
						System.out.print(" ");
					}
				}
				System.out.print("Y");
			} else {
				spacing -= 2;
				for (int i = 0; i < (yCount / 2 - 1); i ++) {
					System.out.print("\\");
					for (int k = 0; k < spacing; k++) {
						System.out.print(" ");
					}
					System.out.print("/");
					int b = ((yCount / 2) - 1);
					int a = (int)((growthNodes * 2 - 1) - ((lineNumber * 2) + yCount + (spacing * yCount / 2))) / (yCount / 2 - 1);
					for (int t = 0; t < a; t++) {
						System.out.print(" ");
					} 
				}
				System.out.print("\\");
				for (int k = 0; k < spacing; k++) {
					System.out.print(" ");
				}
				System.out.print("/");
				
			}
			
				for (int i = 0; i < lineNumber; i++) {
					System.out.print(" ");
				}
				System.out.println("");
				lineNumber++;
			}
			
			for (int i = 0; i < (growthNodes - 1); i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int i = 0; i < (growthNodes - 1); i++) {
				System.out.print(" ");
			}
			System.out.println("\n");
		}		
		scan.close();
	}
	
}
