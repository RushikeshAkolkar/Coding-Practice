/* How Many Digit You Want
i/o-: 123467890
o/p-: 10*0

      9*9

      8*8

      7*7

      6*6

      5*4

      4*3

      3*2

      2*1

      1*0

o/p-: The Total of c = 270
      Enter The Value Of Mod

i/p-: 10
o/p-: 270 Mod 10 = 0  

----------------------------------------------------------------------------------------------------------------

How Many Digit You Want
1234567890
10*0

9*9

8*8

7*7

6*6

5*5

4*4

3*3

2*2

1*1

The Total of c = 285
Enter The Value Of Mod

5
285 Mod 5 = 0
-------------------------------------------------------------------------------------------------------------
How Many Digit You Want
0123456789
10*9
    
9*8 
    
8*7 
    
7*6 
    
6*5 

5*4

4*3

2*1
1*0

The Total of c = 330
Enter The Value Of Mod

10
330 Mod 10 = 0
----------------------------------------------------------------------------------------------------------
How Many Digit You Want
1111011111
10*1=10
   +
9*1=9
   +
8*1=8
   +
7*1=7
   +
6*1=6
   +
5*0=0
   +
4*1=4
   +
3*1=3
   +
2*1=2
   +
1*1=1
   +
0=
50
The Total of c = 50   
Enter The Value Of Mod
10
50 Mod 10 = 0
-------------------------------------------------------------------------------------------------------------
*/

import java.io.*;
import java.util.*;
public class AC {
    public static void main(String args[])
    {
        int x,b,d,c=0;
        int m,j=10;
        System.out.println("How Many Digit You Want");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        while(x>=0&&j>0)
        {
            b=x%10;
            c=c+(j*b);
            System.out.println(j+"*"+b+"="+j*b+"\t");
            j--;
            x=x/10;
            System.out.println("   +");
        }
        System.out.println("0=\n"+c+"\nThe Total of c = "+c);
        System.out.println("Enter The Value Of Mod");
        m=sc.nextInt();
        d=c%m;
        if(d==0)
        {
            System.out.println(c+" Mod "+m+" = 0");
        }
        else
        {
            System.out.println("It is Not Mod");
        }
    }
}