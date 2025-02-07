package Day3;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
      boolean ans = isPrime(91);
        System.out.println(ans);

        for (int i = 100; i < 1000; i++) {
            if (isAmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        
    }

    static boolean isAmstrong(int n)
    {
        int t=n;
        int s=0;

        while(n>0)
        {
            int rem = n % 10;
            n=n/10;
            s=s+ rem*rem*rem;
        }
        return s==t;
    }
    

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c * c <= n) {
            if(n%c ==0 )
            {
                System.out.print(c + " ");
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
