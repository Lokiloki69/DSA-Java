package Day2;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Runs:");
        int runs=sc.nextInt();
        System.out.println("Matchs:");
        int matches=sc.nextInt();
        System.out.println("Not-out:");
        int notOut=sc.nextInt();

//  Follow the steps below to solve the problem: 
// 1.Calculate the number of dismissals, equal to matches – notout.
// 2.Calculate the Batting Average, equal to runs/ (matches – notout).
       
        int batavg=runs/(matches-notOut);
        System.out.println("Batting Average:"+batavg);
        sc.close();

    }
}
