package Day2;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter V1:");
        float v1=sc.nextFloat();
        System.out.println("Enter r value:");
        float r= sc.nextFloat();
        System.out.println("Enter t value:");
        float t=sc.nextFloat();
        float v2=(float)(v1*Math.pow((1-r/100), t));
        System.out.println("Value at the end of "+t+" years : "+v2);
        sc.close();
    }
    
}
