public class Sumofdigit {
    static int Sumofdigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n%9==0?9:n%9;
    }
    public static void main(String[] args) {
        int n=38456;
        System.out.println(Sumofdigit(n));
    }
}
