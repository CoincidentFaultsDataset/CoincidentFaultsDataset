// [IDENTIFYING INFORMATION REMOVED]

#include <stdio.h>
#include <math.h>

int main(int argc, char **argv){
   //check for correct number of args
   if (argc < 3){
      printf("Incorrect number of args. Requires 3 numbers as input.\n");
      return 0;
   }
   
   int numberOfTrees = argv[1];
   //check that age is between 0 and 20
   if(numberOfTrees <= 0 || numberOfTrees > 20){
      printf("Invalid number of trees. Must be between 0 and 20\n");
      return 0;
   }

   //print total number of growth buds
   int numberOfGrowthBuds = 0;
   for(int i = 2; i < numberOfTrees; i++){
      if(argv[i] < 0 || argv[i] > 7){
         printf("Invalid age. Must be between 0 and 7\n");
         return 0;
      }
      numberOfGrowthBuds += pow(2, (int)argv[i]);
   }

   printf(numberOfGrowthBuds);

   //for each tree, find out how big each one is
   for(int i = 2; i < numberOfTrees; i++){
      int ageOfTree = argv[i];
      
      //number of buds per tree == 2^age
      int buds = pow(2, (int)argv[i]);
      
      //print first line
      printf("O");
      for(int i = 0; i < buds; i++){
         printf("-O");
      }
      printf("\n");

      
      
      //print next line
      printf("|");
   }
   

   return 0;
}