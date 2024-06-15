import java.util.Scanner;
public class factorial {
    public int factorial(int n) {
        if(n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        factorial f = new factorial();
        System.out.println(f.factorial(n));
    }
}
