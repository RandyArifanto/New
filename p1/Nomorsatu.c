#include <stdio.h>
#include <stdlib.h>
int main()
{
    int x,i,j;
    char c1,c2;
    scanf("%d",&x);
    scanf(" %c",&c1);
    scanf(" %c",&c2);
    if (x>0 && c1!=c2){
           if(x==1 || x==2){
               i=0;
                while(i<x){
                  j=0;
                    while(j<x){
                    printf("%c",c1);
                    j++;
            }
            printf("\n");
            i++;
            }
           }
           else{
            i=0;
            while(i<x){
                       printf("%c",c1);
                       i++;
                   }
            printf("\n");
            i=0;
            while(i<x-2){
                   printf("%c",c1);
                   j=0;
                   while(j<x-2){
                       printf("%c",c2);
                       j++;
                   }
                   printf("%c\n",c1);
                   i++;
               }
            i=0;
            while(i<x){
                       printf("%c",c1);
                       i++;
                   }
            printf("\n");
        }
    }
    else{
        printf("Masukan tidak valid\n");
    }
    return 0;
}
