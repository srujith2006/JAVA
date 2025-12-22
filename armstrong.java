import java.util.Scanner;

class armstrong
{
    public static boolean is_armstrong(int n)
{
    int l=(int)(Math.log10(n))+1;
    int s=0,m=n;
    while(n!=0)
    {
        int r=n%10;
        s+=Math.pow(r,l);
        n=n/10;
    }
    if(s==m)
        return true;
    return false;
}
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value: ");
        n=sc.nextInt();
        if(is_armstrong(n))
            System.out.println(n+"is a Armstrong number");
        else
            System.out.println(n+"is not a Armstrong number");
    }
}
