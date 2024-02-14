public class recursionCalculator {

  public static void main(String[] args) {
    System.out.println(powers(1, 2)); // return 1
    System.out.println(powers(2, 3)); // return 8
    System.out.println(powers(3, 2)); // return 9
    System.out.println(multiplication(1, 2)); // return 2
    System.out.println(multiplication(10, 2)); // return 20
    System.out.println(multiplication(13, 4)); // return 52
  }

  public static int powers(int n, int m) {
    if (m == 0) {
      return 1;
    } else {
      return n * powers(n, m - 1);
    }
  }

  public static int multiplication(int n, int m) {
    int result = 0;
    if (n == 0 || m == 0) {
      return result;
    } else {
      return result + n + multiplication(n, m - 1);
    }
  }
}
