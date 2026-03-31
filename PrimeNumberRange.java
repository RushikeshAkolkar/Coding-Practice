// This is logic of Composite Number Not a Prime Number
import java.util.Scanner;

public class PrimeNumberRange {
    static boolean primenumbersum(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum == n)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many Array Element you want in an Array");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if (primenumbersum(i)) {
                System.out.println(i);
                sum=sum+i;                
            }
        }
        System.out.println("The Sum Of Prime Number is : "+sum);

    }
}
