/*
    Problem_6.c
    Created by Abraham and Bence on 11/11/2019.
*/

#include <stdio.h>
#define Array 3
int main()
{
    int numbers[Array];
    int i, d = 0;
    int e;
    
    for (e = 0; e<1; e=0) {
    
    
    
    for (i = 0; i <3; i++)
    {
        printf("Enter number\n");
        scanf("%d", &numbers[d]);
        
        
        
        d++;
        
        
    }
    
    printf("start\n");
    if(numbers[0] < numbers[1] ){
        if (numbers[0]< numbers[2]) {
            
            if (numbers[2]< numbers[1]) {
                printf("%d\n%d\n%d\n", numbers[0], numbers[2], numbers[1]);
            } else {
                printf("%d\n%d\n%d\n", numbers[0], numbers[1], numbers[2]);
            }
        }
    }
    
    if(numbers[1] < numbers[0] ){
         if (numbers[1]< numbers[2]) {
             
             if (numbers[2]< numbers[0]) {
                 printf("%d\n%d\n%d\n", numbers[1], numbers[2], numbers[0]);
             } else {
                 printf("%d\n%d\n%d\n", numbers[1], numbers[0], numbers[2]);
             }
         }
     }
    
    if(numbers[2] < numbers[1] ){
          if (numbers[2]< numbers[0]) {
              
              if (numbers[0]< numbers[1]) {
                  printf("%d\n%d\n%d\n", numbers[2], numbers[0], numbers[1]);
              } else {
                  printf("%d\n%d\n%d\n", numbers[2], numbers[1], numbers[0]);
              }
          }
      }
    }
    
    
    return 0;
}
