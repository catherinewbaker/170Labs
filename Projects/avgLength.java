public class avgLength {

  public static void main(String[] args) {
    System.out.println(avgLength(new String[]{"Hello", "Q"})); // returns 3.0
    System.out.println(avgLength(new String[]{})); // returns 0.0
    System.out.println(avgLength(new String[]{"Hello", "Goodbye"})); // returns 6.0
  }

  // this method takes an array and adds the length of the strings inside and then
  // divides thwm by the total number of entries
  public static Double avgLength(String[] a) {
    Double result = 0.0;
    if (a.length == 0) { //contingency plan for an empty array
      return result; // stops the statement
    } else {
      for (int i = 0; i < a.length; i++) {
        result += a[i].length(); // continues to add the length of a's inputs until the end of the array
      }
    }
    result = result / a.length; // divides by the number of entries in a to find the average
    return result;
  }
}
