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
        char** output_buffer = (char**)calloc(dimension, sizeof(char*)); //Allocate space for the tree
        if(output_buffer == NULL){
            fprintf(stderr, "Error: out of memory!\n");
            free(tree_ages);
            return EXIT_FAILURE;
        }
        for(size_t j = 0; j < dimension; j++){
            output_buffer[j] = (char*)calloc(dimension, sizeof(char));
            if(output_buffer[j] == NULL){
                fprintf(stderr, "Error: out of memory!\n");
                
                for(; j > 0; j--){
                    free(output_buffer[j - 1]);
                }
                free(output_buffer);
                free(tree_ages);
                return EXIT_FAILURE;
            }
        }
    }

}



void tree(char** output_buffer, size_t x, size_t y, bool direction, size_t distance_remaining, size_t cur_age, size_t desired_age){
    if(cur_age == desired_age){
        return;
    }

    //Check if we need to branch
    if(distance_remaining == 0){
        output_buffer[x][y] = 'Y';
        size_t new_distance = (1 << cur_age) + 1; //2^cur_age + 1
        //Make a fork to the left
        tree(output_buffer, x - 1, y - 1, true, new_distance, cur_age - 1, desired_age);
        //Make a fork to the right
        tree(output_buffer, x + 1, y - 1, false, new_distance, cur_age - 1, desired_age);
        return;
    }

    //If 'true' then go left. If 'false' then go right
    output_buffer[x][y] = direction ? '\\' : '/';
    if(direction){
        tree(output_buffer, x - 1, y - 1, direction, distance_remaining - 1, cur_age, desired_age);
    }else{
        tree(output_buffer, x + 1, y - 1, direction, distance_remaining - 1, cur_age, desired_age);
    }
}