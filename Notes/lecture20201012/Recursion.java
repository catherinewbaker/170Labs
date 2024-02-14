public class Recursion {

  public static void main(String[] args) {
    // test powerOfTwo
    System.out.println(powerOfTwo(0)); // 1
    System.out.println(powerOfTwo(1)); // 2
    System.out.println(powerOfTwo(2)); // 4
    System.out.println(powerOfTwo(4)); // 16
    System.out.println(powerOfTwo(5)); // 32

    // test factorial
    System.out.println(factorial(0)); // 1
    System.out.println(factorial(1)); // 1
    System.out.println(factorial(2)); // 2
    System.out.println(factorial(3)); // 6
    System.out.println(factorial(4)); // 24

    // test reverse
    System.out.println(reverse("")); // ""
    System.out.println(reverse("A")); // A
    System.out.println(reverse("ABCDE")); // EDCBA

    // test isPalindrome
    System.out.println(isPalindrome("")); // true;
    System.out.println(isPalindrome("A")); // true;
    System.out.println(isPalindrome("AA")); // true;
    System.out.println(isPalindrome("AB")); // false;
    System.out.println(isPalindrome("AYA")); // true;
    System.out.println(isPalindrome("KAYAK")); // true;
    System.out.println(isPalindrome("KAYAY")); // false;
    System.out.println(isPalindrome("KAYYK")); // false;
  }

  public static int powerOfTwo(int n) {
    if (n == 0) { // base case
        return 1;
    } else { // recursive case
        return 2 * powerOfTwo(n - 1);
    }
  }

  public static int factorial(int n) {
    if (n == 0) { // base case
        return 1;
    } else {
        return n * factorial(n - 1);
    }
  }

  public static String reverse(String s) {
    if (s.length() == 0) { // base case
        return s;
    } else {
        return s.substring(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }
  }

  public static boolean isPalindrome(String s) {
    if (s.length() <= 1) { // base case
        return true;
    } else { // recursive case
        return (s.charAt(0) == s.charAt(s.length()-1)) // check extremes
                && (isPalindrome(s.substring(1, s.length()-1))); // check middle
    }
  }

}

