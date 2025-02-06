package Day2;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marked Price:");
       float mp=sc.nextFloat();
       System.out.println("Enter Discount Percentage:"); 
       float d=sc.nextFloat();
       float bill=mp*(1-d/100);
       System.out.println("Bill:"+bill);
       sc.close();
    }
}
