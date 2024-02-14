public class reverseInPlace {

  public static void main(String[] args) {
    int[]t = new int[]{1, 2, 3}; // initializes an array
    reverse(t); // runs it through reverse to edit t
    System.out.println(arrayToString(t)); // shows us what t is (return {3, 2, 1})
    t = new int[]{4, 5, 6, 7};
    reverse(t);
    System.out.println(arrayToString(t)); // return {7, 6, 5, 4}
    t = new int[]{3, 6, 9};
    reverse(t);
    System.out.println(arrayToString(t)); // return {9, 6, 3}
    t = new int[]{};
    reverse(t);
    System.out.println(arrayToString(t)); // return {}
  }

  public static void reverse(int[] a) {
    int[] b = new int[a.length]; // creates a new array b
    for (int j = 0; j < a.length; j++) { // this loop makes all elements of b equal to a
      b[j] = a[j];
    }
    for (int i = 0; i < a.length; i++) { // replaces the elements in a with b's but backwards
      a[i] = b[a.length - 1 - i];
    }
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
