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
public class Nomordua {

    public static void main(String[] args) {
        int x,i,j;
        char c1,c2;
        Scanner s = new Scanner(System.in);

        x=s.nextInt();
        c1=s.next().charAt(0);
        c2=s.next().charAt(0);
        
        if(x>0 && c1!=c2)
        {
            if(x==1||x==2)
            {
                for(i=0;i<x;i++)
                {
                    for(j=0;j<x;j++)
                    {
                        System.out.print(c1);
                    }
                System.out.println();
                }
            }
            else
            {
                for(i=0;i<x;i++)
                {
                    System.out.print(c1);
                }
                System.out.println();
                for(i=0;i<(x-2);i++)
                {
                    System.out.print(c1);
                    for(j=0;j<x-2;j++)
                    {
                        System.out.print(c2);
                    }
                    System.out.println(c1);
                }
                for(i=0;i<x;i++)
                {
                    System.out.print(c1);
                }
                System.out.println();
            }
        }
        else
        {
                System.out.println("Masukan tidak valid");
        }
    }
}
