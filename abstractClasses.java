import java.util.*;
import java.lang.*;
import java.io.*;

abstract class shape
{
    Scanner sc=new Scanner(System.in);
    public abstract void getInput();
    public abstract void cal_Area();
    public void showShape()
    {
        System.out.println("I am inside the abstract class shape");
    }
}

class rectangle extends shape{
    int l,b;
    public void getInput()
    {
        System.out.println("Enter length , breadth values respectively:");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    public void cal_Area()
    {
        System.out.println("area of rectangle:"+(l*b));
    }
}

class circle extends shape{
    double r;
    public void getInput()
    {
        System.out.println("Enter radius value :");
        r=sc.nextDouble();
    }
    public void cal_Area()
    {
        System.out.println("area of circle:"+(3.14*r*r));
    }
}

class Main
{
  public static void main (String[] args) {
       shape s;
       s=new rectangle();
       s.getInput();
       s.cal_Area();
       s.showShape();
       s=new circle();
       s.getInput();
       s.cal_Area();
       s.showShape();
   } 
}
