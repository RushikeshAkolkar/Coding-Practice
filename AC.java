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
            System.out.println(c+" Mod "+m+);
        }
        else
        {
            System.out.println("It is Not Mod");
        }
    }
}