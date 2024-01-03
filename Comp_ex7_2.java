public class Comp_ex7_2 {
    public static void main(String[] args) {
        String[][] colour = {{"red","yellow","blue"},{"orange","green","purple"}};
        for (int i = 0;i<colour.length;i++){
            for (int j =0;j< colour[i].length;j++){
                System.out.print(colour[i][j]+" ");
            }
            System.out.println();
        }
    }
}
