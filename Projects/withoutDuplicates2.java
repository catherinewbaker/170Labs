public class withoutDuplicates {

  public static void main(String[] args) {
  System.out.println(arrayToString(withoutDuplicates(new int[]{1, 2, 3}))); // returns {1, 2, 3}
  }

  public static int[] withoutDuplicates(int[] a) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            if(a[i] == (a[j])) {
                for (int k = j + 1; k < a.length; k++) {
                  a[k] = a[k + 1];
                }
                a[a.length - 1] = 0;
            }
        }
    }


    return a;
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
