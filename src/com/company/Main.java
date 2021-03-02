package com.company;
import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length of the Box");
       int length=s.nextInt();
        System.out.println("Enter width of the Box");
        int width=s.nextInt();
        System.out.println("Enter height of the Box");
       int  height=s.nextInt();
       Box b=new Box();
       int n=b.Volume(length,width,height);
       int m= (int) b.AreaOfSurface(length,width,height);
       System.out.println(""+ n+" "+m);

    }
}