package Day2;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter CGPA: ");
        float cgpa=sc.nextFloat();
        float per=(float) (9.5 * cgpa);
        System.out.println("Percentage: "+per);
        sc.close();
    }
}
