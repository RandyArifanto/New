import java.lang.*;
import java.util.Scanner;


public class no4 {
    static int IsWithinRange (float X, float min, float max){
    int hasil;
    if (min <= X && X <= max)
    {
        hasil = 1;
    }
    else
    {
        hasil = 0;
    }
    return hasil;
    }

public static void main(String [] args){
Scanner input= new Scanner(System.in);

float Nilai_IP,Total;
int Jumlah_Data,Jumlah_Lulus;
int Nilai_Batas=-999;

        Total=0;
        Jumlah_Data=0;
        Jumlah_Lulus=0;
        float min=(float) 2.75;
        float max=(float) 4.00;

        do{
        Nilai_IP=input.nextFloat();
        if (IsWithinRange(Nilai_IP,0,4)==1) {
      	Jumlah_Data++;
      	Total=Total+Nilai_IP;

        if (IsWithinRange(Nilai_IP,min,max)==1) {
           Jumlah_Lulus++;
                }
            }
        }
        while (Nilai_IP != Nilai_Batas);


    if (Jumlah_Data==0 && Nilai_IP==Nilai_Batas){
	System.out.println("Tidak ada data sama sekali");
    } else {

                System.out.println(Jumlah_Data);

                System.out.println(Jumlah_Lulus);

                System.out.println(Jumlah_Data-Jumlah_Lulus);

                System.out.printf("%.2f",Total/(float)Jumlah_Data);
                System.out.println();



    }
}

}
