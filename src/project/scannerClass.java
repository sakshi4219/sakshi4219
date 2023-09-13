package project;

import java.util.Scanner;

public class scannerClass
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>4)
            System.out.println("java program");
        else if(a<4)
            System.out.println("python program");
         else System.out.println("no program");
    }
}
