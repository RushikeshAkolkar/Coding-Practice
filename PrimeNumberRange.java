// This is logic of Composite Number Not a Prime Number
//Difference between prime number vs composite number
/*
prime number -: the numbers which are divisible by 0 and it self or
                the numbers which have only 2 factores.
composite Number -: the Numbers which have more than 2 factores is 
                    called as composite Number
Perfect Number -: the number is a positive integer equal to the 
                sum of its proper positive divisors .
                e.g- the first 4 perfect numbers are
                6,28,496,8128

*/
/*
i/p -: how many Array Element you want in an Array
10000       
o/p -: The Sum Of Perfect Number is upto 10000: 8658
----------------------it means sum of 6,28,496,8128 -----
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
                sum=sum+i;                
            }
        }
        System.out.println("The Sum Of Perfect Number is upto "+n+ ": "+sum);

    }
}
