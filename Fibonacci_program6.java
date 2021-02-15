import java.util.Scanner;
class Fibonacci_program6
 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        int i = 1,a = 0, b = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n)
        {
            System.out.print(a+ "    ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }
    }
}