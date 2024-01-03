import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Comp_ex7_5 {
    public static void main(String[] args)throws IOException {
        String output = "self.txt";
        String input = "self.txt";
        PrintWriter outputfile = new PrintWriter(output);
        outputfile.println("Hi Professor, I am Samar Khajuria and I hail from the city of Jammu And Kashmir India.");
        outputfile.println("I am currently pursuing Bachelor of Computing Science from Thompson Rivers University.");
        outputfile.println("I never thought of being an engineer but i was good in math and loved computers so i guess here i am.");
        outputfile.println("Both of my parents were high profile officer so my goal in life to be better than them");
        outputfile.println("My goal in life is to get rich and travel the world and to fill up my passport like a stamp collection.");
        outputfile.println("Apart from that I love to play sports but due to the busy schedule i hardly get any time. ");
        outputfile.println("Lets see where the waves take me in the future.");
        outputfile.close();
        File intputfile = new File(input);
        Scanner sc = new Scanner(intputfile);
        System.out.println(intputfile);
    }
}


