import java.util.Scanner;
public class Comp_ex7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        countDown(num);
    }
    public static void countDown(int number) {
        if (number == 0) {
            System.out.print("0 ");
            return;
        }

        System.out.print(number + " ");
        countDown(number - 1);
    }
}
