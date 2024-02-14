public class robustDivision {

  public static void main(String[] args) {
    System.out.println(sumOfIntegerDiv(new int[]{2, 4, 6, 0, 8, 16}, 4)); // 3
    System.out.println(sumOfIntegerDiv(new int[]{2, 4, 6, 0, 8, 16}, 5)); // 5
  }

  public static int sumOfIntegerDiv(int[] a, int n) {
    int result = 0;
    for (int i = 1; i < n; i++) { // index from 1 to n
      try {
        result += a[i] / a[i - 1]; // allows for fewer out of bounds errors (the -)
      } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero. Skipping index: " + i); // error message
        n++; // increases the index
        if (i < n - 1) {
          i++; // increases the position so the index is skipped
          result += a[i] / a[i - 1]; // continues with the division
        } else {
          return result; // returns the result if we are at the last index
        }
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Cannot access array at index: " + i); // error message
        return result; // returns result because we are at the from index
      } catch (Exception e) {
        System.out.println("Something went wrong! Skipping index: " + i); // LDE error
        if (i < n - 1) {
          i++;
          result += a[i] / a[i - 1]; // skips the index if there was any other issue
        } else {
          return result; // returns result if we're at the end of the index
        }
      }
    }
    return result;
  }
}
