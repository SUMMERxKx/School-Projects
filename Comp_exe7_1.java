public class Comp_exe7_1 {
    public static void main(String[] args) {
        System.out.println("Array");
        int[][] num = {{10, 20, 30}, {40, 50, 60}};
        int numrows = num.length;
        int numcol = num[0].length;
        int[][] transverse = new int[numcol][numrows];
        for (int i = 0; i < numrows; i++) {
            for (int j = 0; j < numcol; j++) {
                transverse[j][i] = num[i][j];
                System.out.print(num[i][j]+" ");

            }
            System.out.println();
        }
        for (int i =0;i<numcol;i++){
            for (int j=0;j<numrows;j++){
                System.out.print(transverse[i][j]+" ");
            }
            System.out.println();
        }
    }
}