// This is logic of Composite Number Not a Prime Number
//Difference between prime number vs composite number
/*
prime number -: the numbers which are divisible by 0 and it self or
                the numbers which have only 2 factores.
composite Number -: the Numbers which have more than 2 factores is 
                    called as composite Number e.g 6->2,3,1,6
Perfect Number -: the number is a positive integer equal to the 
                sum of its proper positive divisors .
                e.g- the first 4 perfect numbers are
                6,28,496,8128
even Number -: the Number which are divisible by 2 or reminder is 0 
              then that number is called as even Number
odd number -: the number not divisible by 2 or reminder is 1
                then that Number is called as odd number.
natural number -: the number which is ...-3,-2,-1,0,1,2,3....
                    then that Number is called as natural Number
whole Number  -:  0,1,2,3,.... this series is called as whole number
negative number -: -1,-2,-3,..... this series is called as negative number
positive number -:1,2,3,.... this series is called as positive number.
complex number -: sqrt(3)/2  this type of number is called as complex number


-------------------------------------------------------------------------


1. Permutation Formula (Order Matters)
Permutation is used to calculate the number of arrangements of 
 objects taken from a set of 
 distinct objects. 
Formula:

(n1*n2*n3*....nN)/(n-r)!
OR
n!/(n-r)!

Example: To arrange 3 people (from a group of 5 :)
 ways.

 
 2.2. Combination Formula (Order Doesn't Matter)
Combination is used to calculate the number of ways to choose 
 objects from a set of 
 distinct objects, where the order of selection does not matter. 
Formula:


(n1*2*n3*....*nN)/(1*2*3*4*....*r)*(n-r)!

or
n!/r!*(n-r)!
Example: To select a team of 3 people ( from a group of 5 )
 
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
                System.out.println(i);
                sum=sum+i;                
            }
        }
        System.out.println("The Sum Of Perfect Number is upto "+n+ ": "+sum);

    }
}
