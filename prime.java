import java.util.Scanner;

class Numb
{
    public static boolean isprime(int n)
    {
        if(n==1)
            return false;
        if(n==2 || n==3)
            return true;
        for(int i=2;(i*i)<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("enter n value: ");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(2+" ");
        for(int i=3;i<=n;i=i+2)
        {
            if(isprime(i))
                System.out.print(i+" ");
        }
    }
}
