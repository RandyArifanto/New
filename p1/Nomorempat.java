/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author AO756
 */
public class Nomorempat {
//tugas Alpro  
    public static int IsWithinRange(float X, float min, float max){
        int hasil;
        if (X>=min && X<=max){
            hasil = 1;
        }
        else{
            hasil = 0;
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] ip_shadow = new float[300];
        float[] ip_real = new float[300];
        int i,j,k,lulus;
        i=0;
        j=1;
        lulus=1;
        while (ip_shadow[i]>-999){
        ip_shadow[i+1]=s.nextFloat();
        int cek = IsWithinRange(ip_shadow[i+1],0,4);
        if (cek==1){
            ip_real[j]=ip_shadow[i+1];
            int cek_lulus = IsWithinRange(ip_real[j],2.75f,4);
            if (cek_lulus==1){
                lulus++;
            }
            j++;
        }
        i++;
    }
    if(j!=1){
    System.out.println(j-1);/*IP yang valid*/
    System.out.println(lulus-1);/*IP Lulus*/
    System.out.println(j-lulus);/*IP tidak lulus*/
    float jumlah=0;
    for(k=1;k<j;k++){
        jumlah=jumlah+ip_real[k];
    }
    float rata = jumlah/(k-1);
    System.out.printf("%.2f",rata);
	System.out.println();/*IP rata - rata*/
    }
    else{
        System.out.println("Tidak ada data");
    }
    }
    
}
