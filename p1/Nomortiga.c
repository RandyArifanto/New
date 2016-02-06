#include <stdio.h>
#include <stdlib.h>

int IsWithinRange (float X, float min, float max){
    int hasil;
    if (X>=min && X<=max){
        hasil = 1;
        return hasil;
    }
    else{
        hasil = 0;
        return hasil;
    }
}
int main()
{
    float ip_shadow[3000],ip_real[3000];
    int i,j,k,lulus;
    /*ip[0] = 0;*/
    i=0;
    j=1;
    lulus=1;
    while (ip_shadow[i]!=-999){
        scanf("%f",&ip_shadow[i+1]);
        int cek = IsWithinRange(ip_shadow[i+1],0,4);
        if (cek==1){
            ip_real[j]=ip_shadow[i+1];
            int cek_lulus = IsWithinRange(ip_real[j],2.75,4);
            if (cek_lulus==1){
                lulus++;
            }
            j++;
        }
        i++;
    }
    if(j!=1){
    printf("%d\n",j-1);/*IP yang valid*/
    printf("%d\n",lulus-1);/*IP lulus*/
    printf("%d\n",j-lulus);/*IP tidak lulus*/
    float jumlah=0;
    for(k=1;k<j;k++){
        jumlah=jumlah+ip_real[k];
    }
    float rata = jumlah/(k-1);
    printf("%0.2f\n",rata);/*IP rata rata*/
    }
    else{
        printf("Tidak ada data\n");
    }
    return 0;
}
