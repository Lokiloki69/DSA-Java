package Day1;

public class TypeCasting {
    public static void main(String[] args) 
    {

        int num = (int)64.906334f;
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        f=f+num;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
        
    }
}
