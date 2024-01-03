
import java.util.Scanner;

public class ShoeBrand {
    public static void main(String[] args) {
        System.out.println("What is your shoe brand");
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        switch (brand){
            case "nike":
                System.out.println("Just do it");
                break;
            case "reebok":
                System.out.println("Life is not a spectator sport");
                break;
            case "adidas":
                System.out.println("Impossible is nothing");
                break;
            default:
                System.out.println("Invalid output");
        }

    }
}
