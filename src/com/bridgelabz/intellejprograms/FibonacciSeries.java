package com.bridgelabz.intellejprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of terms");
        int n=scanner.nextInt();
        int i=0,j=1,nextTerm;
        System.out.println("Fibonacci series is ");
        for(int c=0;c<n;c++)
        {
            if(c<=1)
                nextTerm=c;
            else
            {
                nextTerm=i+j;
                i=j;
                j=nextTerm;
            }
            System.out.println(nextTerm);
        }
    }
}
