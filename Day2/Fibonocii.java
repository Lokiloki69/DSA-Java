package Day2;

import java.util.Scanner;

public class Fibonocii {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter N value: ");
    int n=sc.nextInt();
    int a=0,b=1;
    int count =2;

    while(count <=n)
    {
        int temp =b;
        b=b+a;
        a=temp;
        count++;
    }
    System.out.print(n+"th Fibonacii is : " +b);
    sc.close();
 }   
}
