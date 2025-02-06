package Day2;

import java.util.Scanner;

public class Distance2points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter (x1,y1) values:");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("Enter the (x2,y2) values:");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double d=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println("Distance:"+d);
        sc.close();
    }
}
