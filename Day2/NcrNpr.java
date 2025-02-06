package Day2;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n : ");   
        int n=sc.nextInt();
        System.out.print("r : ");
        int r=sc.nextInt();
        int t=n;

        long p=1,f=1;
        for(int count=1;count<=r;count++)
        {
            p = p * t--;
            f *=    count;
        }
        System.out.println("nPr : "+p);
        System.out.println("nCr : "+p/f);
        sc.close();

    }
}
