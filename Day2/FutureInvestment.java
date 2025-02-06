package Day2;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Investment Amount :");
        double invAmount=sc.nextDouble();
        System.out.print("Interest Rate : ");
        Double rate=sc.nextDouble();
        //rate = (r/100)  * (1/12)
        rate /= 1200;
        System.out.print("Years : ");
        int years=sc.nextInt();
        double futAmount=(invAmount * Math.pow((1+rate), years * 12));
        System.out.println("Future Amount : "+ futAmount);
        sc.close();
    }
}
