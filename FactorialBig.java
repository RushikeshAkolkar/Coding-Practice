import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        BigDecimal bi = BigDecimal.ONE;
        int sum=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            bi = bi.multiply(new BigDecimal(i));
        }
        System.out.println("Factorial = "+bi);
    }
}
