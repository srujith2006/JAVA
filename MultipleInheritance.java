interface i1
{
    int x=10;
    int y=20;
    void show();
}
interface i2
{
    int x=22;
    int y=33;
    void show();
}
class c implements i1,i2
{
    public void show()
    {
        System.out.println("hey here show function inherited from i1,i2 in general here multiple inheritance happend");
    }
}
class Main
{
    public static void main(String[] args)
    {
        c c1=new c();
        c1.show();
    }
}
