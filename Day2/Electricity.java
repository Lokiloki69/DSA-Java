package Day2;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Units of the Current Bill:");
        int units=sc.nextInt();
        int bill;
        if(units<=100)bill=units*10;
        else if(units<=200)bill=(100*10)+(units-100)*15;
        else if(units<=300)bill=(1000)+(15*100)+(units-200)*20;
        else bill=(1000)+(15*100)+(20*100)+(units-300)*25;

        System.out.println("Bill:"+bill);
        sc.close();
    }
}
