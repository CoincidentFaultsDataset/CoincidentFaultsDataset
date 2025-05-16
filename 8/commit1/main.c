#include <stdio.h>
#include <stdlib.h>


#define MAX_LINE_SIZE (256)

int main(){
    size_t num_of_trees = 0;
    size_t scanned_elements = 0;

    //Get the number of trees to generate
    scanned_elements = scanf("%lu", &num_of_trees);
    if(scanned_elements != 1){
        fprintf(stderr, "Error: Value entered was not a number!\n");
        return EXIT_FAILURE;
    }

    //Allocate space to store the ages
    size_t* tree_ages = (size_t*)calloc(num_of_trees, sizeof(size_t));
    if(tree_ages == NULL){
        fprintf(stderr, "Error: out of ram!\n");
        return EXIT_FAILURE;
    }

    //Read the input of the ages from the user
    for(size_t i = 0; i < num_of_trees; i++){
        scanned_elements = scanf("%lu", &tree_ages[i]);
        if(scanned_elements != 1){
            fprintf(stderr, "Error: could not read input!");
            free(tree_ages);
            return EXIT_FAILURE;
        }
    }



    //Generate the trees
    for(size_t i = 0; i < num_of_trees; i++){
        
    }

}