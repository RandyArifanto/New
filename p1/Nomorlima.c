#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main()
{
    long x,z,i,s,k;
    char y;
    s=1;
    scanf("%d",&x);
    scanf(" %c",&y);
    if(y=='A'){
        z=LONG_MAX;
        i=0;
        while(i<x){
            scanf("%d",&k);
            if(k==z){
                s=s+1;
            }
            if(k<z){
                z=k;
            }
        i++;
        }
        printf("%d\n",z);
        printf("%d\n",s);
    }
    else if(y=='B'){
        z=LONG_MIN;
        for(i=0;i<x;i++){
            scanf("%d",&k);
            if(k==z){
                s=s+1;
            }
            if(k>z){
                z=k;
            }
        }
        printf("%d\n",z);
        printf("%d\n",s);
    }
    return 0;
}
