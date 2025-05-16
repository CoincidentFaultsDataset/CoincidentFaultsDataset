#include "MagicTrees.h"
#include <stdio.h>
#include <math.h>

// [IDENTIFYING INFORMATION REMOVED]

int main(){
    int numTrees;
    scanf("%d", &numTrees);

    if(numTrees > 20 || numTrees <= 0){
        printf("Invalid number of trees! Please select a number greater than 0 and less than 20");
    }

    int ageOfTree[numTrees];
    int growthBuds = 0;
    for (int i = 0; i < numTrees; i++){
        int myAge;
        scanf("%d", &myAge);

        if(myAge > 7 || myAge < 0){
            printf("Not a valid age! Please select an age >= 0 and less than 7");
        }

        ageOfTree[i] = myAge;
        growthBuds += pow(2,myAge);
    }

    printf("%d \n", growthBuds);

    for (int i = 0; i < numTrees; i++){
        printf("\n\n\n");
        treePrint(ageOfTree[i]);
    }

return 0;
}

void treePrint(int age){
    
    int growthBuds = pow(2,age);

    if(growthBuds == 1){
        printf("o\n");
    } else {
        printf("o");
        for (int g = 1; g < growthBuds -1 ; g++){
            printf("-o");
        }
        printf("-o\n");
    }

    for (int h = 0; h < growthBuds; h++){
        if(h == 1){
            printf("-");
            printf("-Y-");
            printf("-|-");
        }
    }

}