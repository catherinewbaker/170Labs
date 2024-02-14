public class ArrayExample {

  public static void main(String[] args) {
    int[] a; // declare an array of integers
    a = new int[4]; // creat an array with four slots
    a[0] = 7; // assign 7 to the first element of a
    a[1] = 3;
    a[2] = 15;
    a[3] = 9;
//    a[4] = 1; // ERROR: index out of bounds

    System.out.println(a[2]); // 15

    System.out.println(a); // does not print the content of the array

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

    // print all the elements in one line
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println(); // moves the terminal prompt to a new line

    int[] b = new int[0]; // array with no elements

    //Test sumAll
    System.out.println("Sum: " + sumAll(a)); //34
    System.out.println("Sum: " + sumAll(b)); //0

    // Test arrayToString
    System.out.println("a: " + arrayToString(a)); // [7, 3, 15, 9]
    System.out.println("b: " + arrayToString(b)); // []
    System.out.println("a: " + arrayToString2(a)); // [7, 3, 15, 9]
    System.out.println("b: " + arrayToString2(b)); // []
    System.out.println("a: " + arrayToString3(a)); // [7, 3, 15, 9]
    System.out.println("b: " + arrayToString3(b)); // []

    // Test minValue
    System.out.println("Min: " + minValue(a)); // 3

    // Test minIndex
    System.out.println("Index of the min: " + minIndex(a)); // 1

  }


  // calculate the sum of all the elements in array x
  public static int sumAll(int[] x) {
    int result = 0;
    for (int i = 0; i < x.length; i++) {
      result += x[i];
    }
    return result;
  }

  // return a string representation of an array
  //such as [a[0], a[1], ..., a[n-1]]
  // make sure the method doesn't crash
  // if the array is empty (zero elements)
  // Example: [7, 3, 15, 9]
  public static String arrayToString(int[] x) {
    String result = "[";
    for (int i = 0; i < x.length - 1; i++) {
      result += x[i] + ", ";
    }
    if (x.length > 0) {
      result += x[x.length - 1]; // last element
    }
    result += "]";
    return result;
  }

  public static String arrayToString2(int[] x) {
    String result = "[";
    if (x.length > 0) {
      result += x[0];
    }
    for (int i = 1; i < x.length; i++) {
      result += ", " + x[i];
    }
    result += "]";
    return result;
  }

  public static String arrayToString3(int[] x) {
    String result = "[";
    for (int i = 0; i < x.length - 1; i++) {
      result += x[i];
      if (i != x.length - 1) {
        result += ", ";
      }
    }
    result += "]";
    return result;
  }

  // find the minimum element in array x
  // assume x is not empty
  public static int minValue(int[] x) {
    int result = x[0]; // value
    for (int i = 1; i < x.length; i++) {
      if (x[i] < result) {
        result = x[i];
      }
    }
    return result;
  }

  // find the index of the minimum element in array x
  // assume x is not empty
  public static int minIndex(int[] x) {
    int result = 0; // index
    for (int i = 1; i < x.length; i++) {
      if (x[i] < x[result]) {
        result = i;
      }
    }
    return result;
  }




}
