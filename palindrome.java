import java.util.Scanner;

class main{
    public static boolean ispalindrome(int k)
    {
        int m=k;
        int sum=0;
        while(k!=0)
        {
            int r=k%10;
            sum=sum*10+r;
            k=k/10;
        }
        if(sum==m)
            return true;
        return false;
    }
    public static boolean isPrime(int n)
    {
        if(n==2)
            return true;
        for(int i=2;(i*i)<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value: ");
        n=sc.nextInt();
        if(n>2)
            System.out.print(2+" ");
        for(int i=3;i<=n;i=i+2)
        {
            if(isPrime(i))
            {
                if(ispalindrome(i))
                    System.out.print(i+" ");
            }
        }
    }
}
