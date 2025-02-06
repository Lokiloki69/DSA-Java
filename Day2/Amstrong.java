package Day2;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number : ");
        int n=sc.nextInt();
        int r,s=0,t=n;
        while(t>0)
        {
            r=t%10;
            s=s+(r*r*r);
            t=t/10;
        }
        if(n==s)System.out.println("Amstrong Number");
        else System.out.println("Not Amstrong");
        sc.close();
    }

}
