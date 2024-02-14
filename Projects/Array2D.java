public class Array2D {

  public static void main(String[] args) {
    // 2D array
    int[][] x = new int[2][3]; // matrix with 2 rows and 3 columns
    x[0][0] = 100; // assign 100 to the element at row 0 and col 0

    double[][] y = new double[2][3];
    y[0][0] = 10;
    y[0][1] = 20;
    y[0][2] = 30;
    y[1][0] = 40;
    y[1][1] = 50;
    y[1][2] = 60;

    System.out.println(y);
    System.out.println(matrixToString(y, y.length, y[0].length));

    double[][] w = {{15, 25, 35}, {45, 55, 65}};
    System.out.println(matrixToString(w, 2, 3));
    }

    public static String matrixToString(double[][] x, int n, int m) {
      String result = "[\n";
      for (int row = 0; row < n; row++) {
        result += " [";
        for (int col = 0; col < m - 1; col++) {
          result += x[row][col] + ", ";
        }
        result += x[row][m - 1] + "]\n";
      }
      result += "]";
      return result;
    }
}
