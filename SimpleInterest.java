import java.util.Scanner;

class simpleInterest
{
    public static void main(String[] args) {
        float p,t,r;
        System.out.println("please enter p,t,r values respectively..");
        Scanner Sc=new Scanner(System.in);
        p=Sc.nextFloat();
        t=Sc.nextFloat();
        r=Sc.nextFloat();
        System.out.println("simple interest="+(p*t*r)/100);
    }
}
