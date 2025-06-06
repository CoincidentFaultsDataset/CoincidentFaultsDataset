import java.util.Scanner;

class MagicTrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int trees = scan.nextInt();
        int[] ages = new int[trees];
        for (int i = 0; i < trees; i++) {
            ages[i] = scan.nextInt();
        }

        int buds = 0;
        // calculates total buds in forest
        for (int i = 0; i < ages.length; i++) {
            buds+=1*Math.pow(2, ages[i]);
        }

        System.out.println(buds);

        // prints all trees, with spaces inbetween
        for (int i = 0; i < ages.length; i++) {
            printTree(ages[i]);
            System.out.println();
        }

        scan.close();
    }

    public static void printTree(int age) {
        int buds = (int) (1*Math.pow(2, age));
        if (buds > 2) {
            printBuds(buds);
            printSegment(buds/2, 3, 1);
        } else if (buds == 2) {
            System.out.println("O-O");
        } else {
            System.out.println("O");
        }
        
        if (buds > 1) {
            for (int i = 0; i <= (buds-1)*2; i++) {
                if (i == buds-1) {
                    System.out.print("Y");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= (buds-1)*2; i++) {
            if (i == buds-1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void printBuds(int buds) {
        for (int i = 0; i < buds-1; i++) {
            System.out.print("O-");
        }
        System.out.println("O");
    }

    public static void printSegment(int numy, int spacing, int padding) {  
        for (int i = 0; i < padding; i++) {
            System.out.print("-");
        }

        for (int i = 0; i < numy-1; i++) {
            System.out.print("Y");
            for (int j = 0; j < spacing; j++) {
                System.out.print("-");
            }
        }

        System.out.print("Y");
        for (int i = 0; i < padding; i++) {
            System.out.print("-");
        }

        System.out.println();
        padding++;
        // second line
        int memorySpacing = spacing;
        int memoryPadding = padding;
        for (int repetitions = 0; repetitions < memoryPadding-1; repetitions++) {
            for (int i = 0; i < padding; i++) {
                System.out.print("-");
            }
    
            for (int i = 0; i < numy/2; i++) {
                System.out.print("\\");
                for (int j = 0; j < spacing-2; j++) {
                    System.out.print("-");
                }
                System.out.print("/");
                if (i != numy/2-1) {
                    for (int k = 0; k < spacing+2; k++) {
                        System.out.print("-");
                    }
                }   
            }
    
            for (int i = 0; i < padding; i++) {
                System.out.print("-");
            }
    
            System.out.println();
            padding++;
            spacing-=2;
        }

        if (numy/2>1) {
            printSegment(numy/2, memorySpacing*2+1, memoryPadding+1);
        }
    }
}