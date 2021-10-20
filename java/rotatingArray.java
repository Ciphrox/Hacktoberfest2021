public class rotatingArray {
    public static void main(String[] args) {
            int x[][] = { { 20, 60, 50 }, { 50, 90, 10 } };
            printArray(x);
            transArray(x);

    static void printArray(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j] + "\t");
        }
        System.out.println();
    }

    static void transArray(int[][] x) {
        int[][] transarr = new int[x[1].length][x.length];
        for (int i = 0; i < transarr.length; i++) {
            for (int j = 0; j < transarr.length; j++) {
                transarr[i][j] = x[j][i];
            }
            printArray(x);
        }

    }

}
