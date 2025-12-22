import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter sides of triangle:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Optional: basic validity check (triangle inequality)
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle sides");
            return;
        }

        double s = (a + b + c) / 2.0;
        System.out.println("S = " + s);

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area = " + area);
    }
}
