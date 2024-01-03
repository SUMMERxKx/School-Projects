import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        System.out.println("Factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac = 1;
        int i = 1;
        while (i <=num){
            fac = fac*i;
            i++;}
        System.out.println(fac);

        }

    }

