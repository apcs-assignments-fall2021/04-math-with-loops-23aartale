import java.sql.SQLOutput;
import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int a = 1;
        for (int i = 2; i <= x; i++){
            a = a * i;
        }
        return a;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 1;
        int x = 0;
        while (Math.E - e > 0.00000000001){
            x = x + 1;
            e = e + (1/factorial(x));

        }
        return e;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 5;
        double m = (n + x/n)/2;
        while (Math.abs(m-n) > 0.00001) {
            n = m;
            m = (m + x/m)/2;
        }
        return m;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(6));
        System.out.println(calculateE());
        System.out.println(babylonian(27));

        

        scan.close();
    }
}
