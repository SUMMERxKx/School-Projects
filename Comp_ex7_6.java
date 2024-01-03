import java.io.*;

public class Comp_ex7_6 {
    public static void main(String[] args) {
        File file = new File("self.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hi Professor, I am Samar Khajuria and I hail from the city of Jammu And Kashmir India.\n");
            writer.write("I am currently pursuing Bachelor of Computing Science from Thompson Rivers University.\n");
            writer.write("I never thought of being an engineer but i was good in math and loved computers so i guess here i am.\n");
            writer.write("Both of my parents were high profile officer so my goal in life to be better than them\n");
            writer.write("My goal in life is to get rich and travel the world and to fill up my passport like a stamp collection.\n");
            writer.write("Apart from that I love to play sports but due to the busy schedule i hardly get any time. \n");
            writer.write("Lets see where the waves take me in the future.\n");

            writer.close();
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            reader.close();
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
