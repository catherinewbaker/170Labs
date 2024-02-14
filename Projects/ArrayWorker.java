public class ArrayWorker {

  public static void main(String[] args) {
    int[] t = new int[10];
    t[0] = 5;
    t[1] = 3;
    t[2] = 7;
    t[3] = 9;
    System.out.println(arrayToString(t, 4));

    // Shorter way to creat and initialize an array in one line of code
    // Works only when declaring a new variable
    int[] t2 = {5, 3, 7, 9};
    System.out.println(arrayToString(t2, t2.length));
//    t2 = {1, 2, 3}; // ERROR

    //Another way, works in general
    int[]t3 = new int[]{5, 3, 7, 9};
    System.out.println(arrayToString(t3, t3.length));
    t3 = new int[]{1, 2, 3};
    System.out.println(arrayToString(t3, t3.length));

    // test insert
    System.out.println("- - - Test insert - - -");
    insert(t, 4, 10, 2);
    System.out.println(arrayToString(t, 5));

    // test remove
    System.out.println("- - - Test remove - - -");
    int q = remove(t, 5, 1);
    System.out.println("q: " + 1 + ", a: " + arrayToString(t, 4));

  }


  public static String arrayToString(int[] a, int n) {
    String result = "[";
    for (int i = 0; i < n - 1; i++) {
      result = result + a[i] + ", ";
    }
    if (n > 0) {
      result = result + a[n - 1];
    }
    result += "]";
    return result;
  }

  /**
   * Inserts an integer x into position pos in a given array.
   * All the original elements after pos are shifted forward.
   * Assume that there is enough free space in the array to
   * insert the new element.
   *
   * @param a an array of integers
   * @param n number of elements in a
   * @param x element to be inserted
   * @param pos index at which x should be inserted
   */
   public static void insert(int[] a, int n, int x, int pos) {
     if (a.length <= n) {
       return;
     }
     for (int i = n - 1; i > pos; i--) {
       a[i + 1] = a[i];
     }
     a[pos] = x;
   }

   public static int remove(int[] a, int n, int pos) {
     int result = a[pos];
     for (int i = pos + 1; i < n; i++) {
       a[i - 1] = a[i];
     }
     a[n - 1] = 0;
     return result;
   }

}
