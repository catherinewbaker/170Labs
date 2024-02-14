public class PolygonCalculator {

  public static void main(String[] args) {
    System.out.println(matrixToString(polygonCalculator(new int[]{3, 4, 6})));
    System.out.println(matrixToString(polygonCalculator(new int[]{5})));
    System.out.println(matrixToString(polygonCalculator(new int[]{9, 10, 15})));
    System.out.println(matrixToString(polygonCalculator(new int[]{120, 30})));

  }

  public static double[][] polygonCalculator(int[] a) {
    double[][] b = new double[a.length][2];
    for (int j = 0; j < a.length; j++) {
      if (a[j] <= 2) {
        return b;
      }
    }
    for (int i = 0; i < a.length; i++) {
      b[i][0] = a[i];
    }
    for (int k = 0; k < a.length; k++) {
      b[k][1] = (180 - (360.0 / a[k]));
    }
    return b;
  }

  public static String matrixToString(double[][] x) {
    String result = "[\n";
    for (int row = 0; row < x.length; row++) {
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
