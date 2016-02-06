#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x,y,z,k,l,c=0,a,b=0;
    scanf("%d",&x);
    while(y>=0){
        scanf("%d",&y);
        l=y;
        a=0;
        while(l!=0 || a<1){
            z=l%10;
            k=l-z;
            l=k/10;
            if(x==z){
                c++;
            }
        a++;
        }
    b++;
    }
    if(b!=1){
    printf("%d\n",c);
    }
    else{
    printf("Tidak ada bilangan\n");
    }
    return 0;
}
