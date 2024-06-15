import java.util.Scanner;

public class fibonacci {
    public  int fibonacci(int n) {

      if(n == 1 || n == 0) {
          return n;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fibonacci fib = new fibonacci();
        System.out.println("enter the number ");
        int n = sc.nextInt();

        System.out.println("fibonacci number is "+fib.fibonacci(n));


    }
}
