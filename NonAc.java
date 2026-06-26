/*
How Many Digit You Want
1234567890
10*0=0
   +
9*9=81
   +
8*8=64
   +
7*7=49
   +
6*6=36
   +
5*5=25
   +
4*4=16
   +
3*3=9
   +
2*2=4
   +
1*1=1
   +
0=
285
The Total of c = 285
Enter The Value Of Mod
5
285 Mod 5 = 0
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
