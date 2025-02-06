package Day2;

import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Principal (amount): ");
        float p=sc.nextFloat();
        System.out.println("Time t: " );
        float t=sc.nextFloat();
        System.out.println("Rate r: ");
        float r=sc.nextFloat();
        float ci=(float)(p * Math.pow(1+ r/100, t));
        System.out.println("Compound Interest: "+ci);
        sc.close();
    }
}
