import java.util.Scanner;

class fibonacci{
public static int fibo(int n)
{
    if(n==1)
        return 0;
    if(n==2)
        return 1;
    else
        return (fibo(n-1)+fibo(n-2));
}
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int f=fibo(i);
            if(f%2==0)
            sum+=f;
        }
        System.out.println("sum of even fibo numbers :"+sum);
    }
}
