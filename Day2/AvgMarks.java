package Day2;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("N subjects: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter marks: ");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Average marks:"+sum/n);
        sc.close();
    }
}
