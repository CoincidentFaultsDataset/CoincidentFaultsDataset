#include "stdio.h"
#include "stdlib.h"

// Return if n is not in [a,b)
int inRange(int a, int n, int b) {
    return a <= n && n < b;
}

int pow2(int n) {
    return 1 << n;
}

void printRepeatedChar(char c, int n) {
    for (int i = 0; i < n; i++) {
        printf("%c", c);
    }
}

void printTree(int age) {
    // print the buds
    int numBuds = pow2(age);
    for (int i = 1; i < numBuds; i++) {
        printf("O-");
    }
    printf("O\n");

    /* int j = pow2(); */


    

    printf("\n");
}

int main (int argc, char** argv) {
    if (argc < 2) {
        printf("Needs at least the number of trees\n");
        return -1;
    }

    int numTrees = atoi(argv[1]);
    if (!inRange(0, numTrees, 20)) {
        printf("The number of trees must be >= 0 and < 20, not %d\n", numTrees);
        return -1;
    }

    if (argc != numTrees + 2) {
        printf("There must be %d ages, 1 for each tree\n", numTrees);
        return -2;
    }
    
    printf("Hello, World! Trees=%d\n", numTrees);
    
    int* ages = calloc(sizeof(int), numTrees);
    /* int* numBuds = calloc(sizeof(int), numTrees); */
    int numBuds = 0;

    // Sum buds and deal with things
    for (int i = 0; i < numTrees; i++) { // Can do this since 2-argc must be ages
        ages[i] = atoi(argv[i + 2]);
        // Ensure valid age
        if (!inRange(0, ages[i], 7)) {
            printf("Age %d is invalid, ages must satisfy 0 <= age < 7\n", i-2);
            return -3;
        }
        // Add the number of buds the ages[i] tree will have
        numBuds += pow2(ages[i]);
    }
    printf("%d\n", numBuds);

    for (int i = 0; i < numTrees; i++) {
        printTree(ages[i]);
    }

    printf("End program\n");
    
}
