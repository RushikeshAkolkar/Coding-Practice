// This is logic of Composite Number Not a Prime Number
//Difference between prime number vs composite number
/*
prime number -: the numbers which are divisible by 0 and it self or
                the numbers which have only 2 factores.
composite Number -: the Numbers which have more than 2 factores is called as composite Number

*/
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
