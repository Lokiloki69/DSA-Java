package Day2;

import java.util.Scanner;

public class Power {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter N value and Power value:");
    double n=sc.nextDouble();
    double p=sc.nextDouble();
    System.out.println(n+" Power "+p+"="+Math.pow(n, p));
    sc.close();
 }   
}
