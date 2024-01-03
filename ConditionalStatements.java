import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("24 hr Clock");
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the time");
        double time = sc.nextDouble();

        if (time>5&&time<=11){
            System.out.println("Good morning!");
        } else if (time>11&&time<=16) {
            System.out.println("Good afternoon");
        } else if (time>16&&time<=20) {
            System.out.println("Good evening");
        } else if (time>20&&time<=24||time<=5) {
            System.out.println("Good night");
        }else System.out.println("Invalid input");


    }
}
