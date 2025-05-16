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

int main(){
    // 0 = n < 20 trees in forest
    // 0 = age < 7, space delimited
    // each age is spaced out by a new line
    // builds top down and bottom up. -> build bottom up then top down.
    
    // output: total number of growth buds
    // each character spaced with spaces
    
    int* array = malloc(2*sizeof(int));
    int instance = 0;
    char* line;
    while(line != NULL){
        line = getlineSO();
        if(instance > 2){
            // wastes space but dirty solution
            int* er = malloc(instance*sizeof(int));
            memcpy(er, array, instance*sizeof(int));
            array = er;
        }
        if(line[0] == '\n') break;
        if(instance == 0){
            int val = -1;
            sscanf(line, "%d", &val);
            if(val > 20){
                printf("%s\n","ERROR: out of bound trees");
                exit(0);
            }
            array[0] = val;
        }
        else{
            int val = -1;
            sscanf(line, "%d", &val);
            array[instance] = val;
        }
        instance++;
        printf("%s\n",line);
    }
    
    
}

