package Day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number : ");
        int n=sc.nextInt();
        int t=n,r,s=0;
        while(t>0)
        {
            r=t%10;
            s= (s*10)+r;
            t=t/10;

        }
        if(s==n)System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
        sc.close();
    }
}
