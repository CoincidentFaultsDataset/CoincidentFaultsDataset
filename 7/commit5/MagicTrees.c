#include <stdio.h>  // Include standard I/O library for functions like printf() and scanf()



// Main function where execution begins
int main() {
    
    int firstInput, secondInput;  // Declare two integer variables

    // Prompt the user to enter two integers
    
    //number of trees will equal first command line argument
    int numberOfTrees;
    numberOfTrees =2;
    
    //loop over subsequent command line arguments to get the age of each tree
    int ageOfTree;
    ageOfTree = 2;

    //printf("O\n");
    //printf("Y\n");

    for(int j=0; j < numberOfTrees; j++){
    
    for(int i = 0; i < ageOfTree; i++){
        printf("0 ");
    }

    printf("\n");

    //need to do a modulo or something 
    for(int i = 0; i < ageOfTree; i++){
        printf(" Y ");
    }

    printf("\n");
    }
    return 0;
}
