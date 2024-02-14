public class Tally {

  public static void main(String[] args) {
    System.out.println(arrayToString(tally("HEY! Apples and bananas!"))); // {5, 2, 0, 0, 0}
    System.out.println(arrayToString(tally("Bananas are yummy"))); // {4, 1, 0, 0, 1}
    System.out.println(arrayToString(tally("aAaeEeiIioOouUu"))); // {3, 3, 3, 3, 3}
    System.out.println(arrayToString(tally(""))); // {0, 0, 0, 0, 0}


  }

  public static int[] tally(String x) {
    int[] y = new int[5];
    y[0] = 0;
    y[1] = 0;
    y[2] = 0;
    y[3] = 0;
    y[4] = 0;
    for (int k = 0; k < x.length(); k++) {
      if (x.charAt(k) == 'a' || x.charAt(k) == 'A') {
        y[0] += 1;
      } else if (x.charAt(k) == 'e' || x.charAt(k) == 'E') {
        y[1] += 1;
      } else if (x.charAt(k) == 'i' || x.charAt(k) == 'I') {
        y[2] += 1;
      } else if (x.charAt(k) == 'o' || x.charAt(k) == 'O') {
        y[3] += 1;
      } else if (x.charAt(k) == 'u' || x.charAt(k) == 'U') {
        y[4] += 1;
      }
    }
    return y;
  }

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
