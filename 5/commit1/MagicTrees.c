#include "MagicTrees.h"
#include <stdio.h>
#include <math.h>

// [IDENTIFYING INFORMATION REMOVED]

int main(){
    int numTrees;
    scanf("%d", &numTrees);

    if(numTrees > 20){
        printf("Too many trees! Please select a number less than 20");
    }

    int ageOfTree[numTrees];
    int growthBuds = 0;
    for (int i = 0; i < numTrees; i++){
        int myAge;
        scanf("%d", &myAge);

        if(myAge > 7){
            printf("Tolarge! Please select an age less than 7");
        }

        ageOfTree[i] = myAge;
        growthBuds += pow(2,myAge);
    }

    printf("%d %d \n", numTrees, growthBuds);

    for (int i = 0; i < numTrees; i++){
        treePrint(ageOfTree[i]);
    }

return 0;
}

void treePrint(int age){

    int growthBuds = pow(2,age);

    printf
    for (int g = 1; g < growthBuds; g++){
        printf("o-");
    }

}