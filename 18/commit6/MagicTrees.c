// [IDENTIFYING INFORMATION REMOVED]

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

// code to read line from: https://stackoverflow.com/questions/314401/how-to-read-a-line-from-the-console-in-c
// getline function by: Johannes Schuab - litb

char * getlineSO(void) {
    char * line = malloc(100), * linep = line;
    size_t lenmax = 100, len = lenmax;
    int c;
    
    if(line == NULL)
        return NULL;

    for(;;) {
        c = fgetc(stdin);
        if(c == EOF)
            break;

        if(--len == 0) {
            len = lenmax;
            char * linen = realloc(linep, lenmax *= 2);

            if(linen == NULL) {
                free(linep);
                return NULL;
            }
            line = linen + (line - linep);
            linep = linen;
        }

        if((*line++ = c) == '\n')
            break;
    }
    *line = '\0';
    return linep;
}

int generateBaseGrowth(int* arr){
    int sumBuds = 0;
    for (size_t i = 0; i < sizeof(arr)/sizeof(int); i++){
        int buds = (int) pow(2,arr[i]);
        char* lineGen = malloc(sizeof(char)*(buds*2);
        sumBuds += buds;
        // print the first layer
        for (size_t j = 0; j < buds*2; j++;){
            if (j%2==0){
                lineGen[j] = 'O';
            }
            else{
                lineGen[j] = ' ';
            }
        }
        lineGen[(buds*2)-1] = '\0';
        printf("%s\n",lineGen);
        int exArr = arr[i];
        while(arr[i] != 0){
            arr[i]--;
            int branches = (int) pow(2,arr[i]);
            for (size_t k = 1; k < branches; k++){
                
            }
        }
        printf("%s","\n");
    }
    return;
}

int main(){
    // 0 = n < 20 trees in forest
    // 0 = age < 7, space delimited
    // each age is spaced out by a new line
    // builds top down and bottom up. -> build bottom up then top down.
    
    // output: total number of growth buds
    // each character spaced with spaces
    
    int* array;
    int instance = 0;
    char* line;
    while(line != NULL){
        line = getlineSO();
        if(line[0] == '\n') break;
        if(instance == 0){
            int val = -1;
            sscanf(line, "%d", &val);
            if(val > 20 || val < 0){
                printf("%s\n","ERROR: trees declaration not within bounds");
                exit(0);
            }
            array = malloc(sizeof(int)*val);
        }
        else{
            int age = -1;
            sscanf(line, "%d", &val);
            if (age > 7 || age < 0){
                printf("%s\n","ERROR: age declaration not within bounds");
                exit(0);
            }
            array[instance] = val;
        }
        instance++;
        printf("%s\n",line);
    }
    
    // generate starting section of a forest
    // a 1,0 indicates a growth bud yet to start.
    // 2,1,3 creates:
    /*
        O-O // these are the two trees and is a year after growth?
        -Y- // this is a source stem and counts as "1" year. the lines separating them are not year counted.
        -|- 
        dashes are not included and should be spaces instead.
    */
    /* 2,2,4 creates:
        O-O-O-O 
        -Y---Y- this is the two trees?
        --\-/--
        ---Y--- 
        ---|---
    */
    
    int sum = generateBaseGrowth(int* array);
    
    // generate full growth
    
    
}

