public class orderedWord {

  public static void main(String[] args) {
    System.out.println(isOrdered("baby")); // false
    System.out.println(isOrdered("effort")); // true
    System.out.println(isOrdered("hello")); // false
    System.out.println(isOrdered("aaabbbyyz")); // true
  }

  public static boolean isOrdered(String s) {
    for (int i = 0; i < s.length() - 1; i++) { // runs the for loops for as long as the string is
      if (s.charAt(i) > s.charAt(i + 1)) { // stops the for loop if a character is alphabetically out of order
        return false;
      }
    }
    return true;
  }
}
