public class reverseCopy {

  public static void main(String[] args) {
    System.out.println(arrayToString(reverseCopy(new int[]{1, 2, 3}))); // {3, 2, 1}
    System.out.println(arrayToString(reverseCopy(new int[]{1, 2, 3, 4, 5}))); // {5, 4, 3, 2, 1}
    System.out.println(arrayToString(reverseCopy(new int[]{6, 3, 14}))); // {14, 3, 6}
  }

  // take an array and reverses the order of the inputs
  public static int[] reverseCopy(int[] a) {
    int[] b = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[a.length - 1 - i]; // assigns each position in a to b but in the opposite order
    }
    return b;
  }

  // this method we made in class and have seen many times before. It take the array
  // that was returned in reverseCopy and allows us to see it as a string
  public static String arrayToString(int[] a) {
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
