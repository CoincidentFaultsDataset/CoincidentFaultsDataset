// [IDENTIFYING INFORMATION REMOVED]

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){
    // 0 = n < 20 trees in forest
    // 0 = age < 7, space delimited
    // each age is spaced out by a new line
    // builds top down and bottom up. -> build bottom up then top down.
    
    // output: total number of growth buds
    // each character spaced with spaces
    
    char* output = malloc(100);
    char* line = malloc(5);
    while(line != NULL){
        int text = getline(line, 3, stdin);
        printf("%s\n",line);
    }
    
    
}

