import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UniqueElements {

    public static int[] uniqueelements(int a[])
    {
        Arrays.sort(a);
        int temp[]=new int[a.length];
        int j=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                temp[j]=a[i];
                j++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int a[]={1,5,6,3,5,1,2,9,6,4,3,5};
        System.out.println("Umique Elements are : "+Arrays.toString(uniqueelements(a)));
    }
}