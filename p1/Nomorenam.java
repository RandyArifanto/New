/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author AO756
 */
public class Nomorenam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,z,i,s,k;
        char y;
        s=1;
        x=scan.nextInt();
        y=scan.next().charAt(0);
        if(y=='A'){
            z=2147483647;
            i=0;
            while(i<x){
                k=scan.nextInt();
                if(k==z){
                    s=s+1;
                }
                if(k<z){
                    z=k;
                }
            i++;
            }
            System.out.println(z);
            System.out.println(s);
        }
        else if(y=='B'){
        z=-2147483647;
        for(i=0;i<x;i++){
            k=scan.nextInt();
            if(k==z){
                s=s+1;
            }
            if(k>z){
                z=k;
            }
        }
            System.out.println(z);
            System.out.println(s);
        }
    }
    
}
