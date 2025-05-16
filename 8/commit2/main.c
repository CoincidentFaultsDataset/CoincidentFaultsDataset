#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>


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



    size_t sum = 0;
    for(size_t i = 0; i < num_of_trees; i++){
        sum += 1 << tree_ages[i]; //Same as 2^(tree_ages[i])
    }

    //Print the total number of buds
    printf("%lu", sum);


    for(size_t i = 0; i < num_of_trees; i++){
        size_t dimension = 1 << tree_ages[i]; //The width and height of the image is 2^(tree_ages[i]) characters
        char current_char = 'O';
        size_t x_spacing = 1;
        size_t y_spacing = 0;
        size_t x_spacing_counter = x_spacing;
        size_t y_spacing_counter = y_spacing;

        for(size_t x = 0; x < dimension; i++){
            //Print a character at the beginnging and end of the spacing
            if(x_spacing_counter == x_spacing || x_spacing_counter < 0){
                
            }
        }
    }

}



void tree(bool direction){

}