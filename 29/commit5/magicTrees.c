#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int printBranches(int level, int buds){
int space =  (buds*2)-1;
printf("\n");
return 0;
}
int printGeneration(int level, int buds){
//  printf("%d", level);
//  printf("%d", buds);
  int gap = (level * 2) + 1;
  int space =  (buds*2)-1;
  //printf("%d",space );
  for (int j=0; j< level; j++){
    printf(" ");
  }
  printf("Y");
 for (int i=level+1; i<space-(level+1); i++){
   for (int j=0; j<gap; j++){
     printf("-");
     i++;
   }
   printf("Y");

  }

  printf("\n");
  return gap;
}
int printBuds(int age){
  int buds = pow(2,age);
  printf("O ");
  for (int i=1; i<buds-1; i++){
    printf("O ");
  }
  printf("O\n");
  return buds;
}

int printTree(int age){
int buds = printBuds(age);
 //printf("%d", buds);
int generations = (buds);
int gap = printGeneration(1,buds);
for(int i =0; i<generations; i++){
  if (i == gap){
  gap = printGeneration(i, buds);
}
else {
  printBranches(i, buds);
}
}
for(int i=0; i< ((buds*2)/2)-1; i++){
  printf(" ");
}
printf("|\n");

return 1;
}

int main(int argc, char* argv[]){

if (argc < 2){
  perror("invalid args");
  exit(1);
}

char nums = *argv[1];
int digitOfNum = nums -'0';


for (int i=2; i<argc; i++){

  char ageOfTree = *argv[i];
  int ageOfTreeToNum = ageOfTree - '0';
  printTree(ageOfTreeToNum);

}
  return 0;
}
