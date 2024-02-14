public class mathClass {

  public static void main(String[] args) {
    System.out.println(matrixToString(addition(2, 3, 3, 3)));
    System.out.println(matrixToString(addition(15, 30, 23, 27)));
    System.out.println(matrixToString(addition(0, 5, 3, 7)));
    System.out.println(matrixToString(addition(43, 7, 1, 1)));
  }

  public static int[][] addition(int n, int m, int a, int b) {
    int result = 0;
    int result2 = 0;
    int[][] x = new int[3][2];
    x[0][0] = n;
    x[1][0] = m;
    x[0][1] = a;
    x[1][1] = b;
    result = n + m;
    result2 = a + b;
    x[2][0] = result;
    x[2][1] = result2;
    return x;
  }

  public static String matrixToString(int[][] x) {
    String result = "[\n";
    for (int row = 0; row < 3; row++) {
      result += " [";
      for (int col = 0; col < 1; col++) {
        result += x[row][col] + ", ";
      }
      result += x[row][1] + "]\n";
    }
    result += "]";
    return result;
  }
}
