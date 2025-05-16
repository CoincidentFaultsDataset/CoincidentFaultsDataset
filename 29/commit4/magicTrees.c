#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int printGeneration(int level, int buds){
  int gap = (level * 2) + 1;
  printf("%d\n",gap );
 for (int i=0; i<buds; i++){

    printf("Y");

  }

  printf("Y\n");
  return 1;
}
int printBuds(int age){
  int buds = pow(2,age);
  printf("O ");
  for (int i=1; i<buds-1; i++){
    printf(" O ");
  }
  printf(" O\n");
  return buds;
}

int printTree(int age){
int buds = printBuds(age);
printGeneration(1, buds);
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
