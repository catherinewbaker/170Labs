public class isReverse {

  public static void main(String[] args) {
    System.out.println(isReverse("happy", "yppah")); // true
    System.out.println(isReverse("cool", "loac")); // false
    System.out.println(isReverse("", "")); // true
  }

  public static boolean isReverse(String s1, String s2) {
    if (s1.length() == 0 || s2.length() == 0) { // returns true if both strings are empty
      return true;
    } else if (s1.charAt(s1.length() - 1) == s2.charAt(0)) { // comapres the last char in s1 and the first one in s2
      return (true && (isReverse(s1.substring(0, s1.length() - 1), s2.substring(1)))); // recursion with the last letter off s1 and the first off s2
    } else {
      return false;
    }
  }
}
