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

*/
import java.io.*;
import java.util.*;
public class AC {
    public static void main(String args[])
    {
        int x,b,d,c=0;
        int m,j=10;
        System.out.println("How Many Digit You Want");
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        while(x>=0&&j>0)
        {
            b=x%10;
            c=c+(j*b);
            System.out.println(j+"*"+b+"\n");
            j--;
            x=x/10;
        }
        System.out.println("The Total of c = "+c);
        System.out.println("Enter The Value Of Mod\n");
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