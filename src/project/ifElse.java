package project;

import java.util.Scanner;

public class ifElse
{
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a>10)
            System.out.println("greater");
        else System.out.println("smaller");
    }
}
