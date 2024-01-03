import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Largest number");
        System.out.println("Enter First number");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("Enter Second number");
        double num2 = sc.nextDouble();
        System.out.println("Enter Third number");
        double num3 = sc.nextDouble();
        if (num1>=num2&&num1>=num3){
            System.out.println(num1+" is the greatest");
        }
        else if (num2>=num1&&num2>=num3){
            System.out.println(num2+" is the greatest");
        }
        else System.out.println(num3+ " is the greatest");
    }
}
