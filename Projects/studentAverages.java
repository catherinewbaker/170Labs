public class studentAverages {

  public static void main(String[] args) {
    System.out.println(arrayToString(studentAverages(new int[][]{{100, 0, 50}, {100, 100, 80}}, 3, 2))); // return {50.0, 93.333}
    System.out.println(arrayToString(studentAverages(new int[][]{{30, 20, 40}, {100, 100, 100}, {100, 0, 0}}, 3, 3))); // return {30.0, 100.0, 33.333}
    System.out.println(arrayToString(studentAverages(new int[][]{{100, 0, 30}, {70, 75, 80}}, 3, 2)));// return 43.333, 75.0}
    System.out.println(arrayToString(studentAverages(new int[][]{{85, 85, 70}}, 3, 1))); // return {80.0}
  }

  // takes all grades in a row and averages them
  public static double[] studentAverages(int[][] a, int n, int m) {
    double[] b = new double[m]; // new array to store our averages
    for (int col = 0; col < m; col++) {
      for (int row = 0; row < n; row++) {
        b[col] += a[col][row]; // adds all the grads in a row to the relative position in b
      }
      b[col] = b[col] / n; // divides the elements of b by the number of gtrades they should have
    }
    return b;
  }

  // a method made in class to turn our array into something we can read in the terminal
  public static String arrayToString(double[] a) {
    String result = "{";
    for (int i = 0; i < a.length - 1; i++) {
      result = result + a[i] + ", ";
    }
    if (a.length > 0) {
      result = result + a[a.length - 1];
    }
    result += "}";
    return result;
  }
}
