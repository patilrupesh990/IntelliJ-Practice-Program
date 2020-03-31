package com.bridgelabz.intellejprograms;

import java.util.Scanner;

public class ArmStrongNumber {
    static Scanner scanner=new Scanner(System.in);
    public void checkArmStrong(int number){
        int temp=number;
        int result=0;

        while(temp>0){
            int reminedr=temp%10;
            result+=Math.pow(reminedr,3);
            temp=temp/10;
        }
        if (result==number)
            System.out.println(number+" is armStrong Number");
        else
            System.out.println(number+" Is Not ArmStrong");
    }

    public static void main(String[] args) {
        ArmStrongNumber armStrongNumber=new ArmStrongNumber();
        System.out.println("Enter Your Number");
        int number=scanner.nextInt();
        armStrongNumber.checkArmStrong(number);
    }
}
