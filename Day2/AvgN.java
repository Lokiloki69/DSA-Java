package Day2;

import java.util.Scanner;

public class AvgN {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Number:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter values:");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Average:"+sum/n);
        sc.close();
    }

}
