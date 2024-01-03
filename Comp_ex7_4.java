import java.util.Scanner;
public class Comp_ex7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci sequence");
        System.out.println("Enter a number till you want the sequence");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
