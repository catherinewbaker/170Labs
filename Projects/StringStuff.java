public class StringStuff {

  public static void main(String[] args) {
    char c = 'A'; // one char
    String s1 = "ABCD"; // String with 4 characters
    String s2 = "A"; // String with 1 character
    String s3 = ""; // empty String
//  char c2 = ''; // ERROR: there is no empty character

    // quotes are not printed
    System.out.println(c);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    // A char is actually a number
    // See www.asciitable.com
    System.out.println('A' + 1); // 66 (int)
    System.out.println((char)('A' + 1)); // 'B' (char)
    System.out.println("A" + 1); // "A1" (String)
    System.out.println('A' + 1.0); // 66.0 (double)
    System.out.println((char)('A' + 1.0)); // 'B' (char)

    // Operations with Strings
    // There are many... See:
    // http://docs.oracle.com/javase/8/docs/api/java/lang/String.html
    char k = s1.charAt(2); // C
    System.out.println(k); // C

    int n = s1.length();
    System.out.println(n); // 4

    String s4 = "Hello Everyone";
    System.out.println(s4.substring(3, 8)); // lo Ev
    System.out.println(s4.substring(8)); // eryone
    System.out.println(s4.toUpperCase()); // HELLO EVERYONE
    System.out.println(s4.toLowerCase()); // hello EVERYONE

    // Conmpare two strings for equality
    // You can't use == between two strings (weird results)
    String x = "hey";
    String y = "you";
    String z = "hey";
    System.out.println(x.equals(y)); // false
    System.out.println(x.equals(z)); // true

    //Compare two strings alphabetically (alphanumerically)
    System.out.println("apple".comapareTo("banana")); // < 0
    System.out.println("apple".comapareTo("BANANA")); // > 0
    System.out.println("apple".comapareTo("Banana")); // > 0
    System.out.println("apple".comapareTo("banana")); // < 0
    System.out.println("apple".comapareTo("Apple")); // > 0
    System.out.println("apple".comapareTo("apply")); // < 0
    System.out.println("apple".comapareTo("apples")); // < 0

    //Test mySubstring
    System.out.println(mySubstring(s4, 3, 8)); // lo Ev
    System.out.println(mySubstring("examination", 3, 8)); // minat

    System.out.println(mySubstring(s4, 3, 8, 2)); // l v
    System.out.println(mySubstring(s4, 3, 8, 3)); // lE

    


  }

  // Examples:
  // mySubstring("Hellow Everyone", 3, 8) returns "lo Ev"
  // mySubstring("examination", 3, 8) returns "minat"
  public static String mySubstring(String s, int start, int end) {
    String result = "";
    for (int i = start; i < end; i++) {
      result += s.charAt(i);
    }
    return result;
  }

  // Method overloading: same name, different parameter number and/or types
  public static String mySubstring(String s, int start, int end, int step) {
    String result = "";
    for (int i = start; i < end; i+= step) {
      result += s.charAt(i);
    }
    return result;
  }

  public static String reverse(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      result = s.charAt(i) + result;
    }
    return result;
  }

  // Examples:
  // mergeStrings("ABCD", "1234"); "A1B2C3D4"
  // mergeStrings("AB", "1234"); "A1B234"
  // mergeStrings("ABCD", "12"); "A1B2CD"
  public static String mergeStrings(String s1, String s2) {
    String result = "";
    if (s1.length() < s2.length()) {
      for (int i = 0; i < s1.length(); i++) {
        result += s1.charAt(i) + s2.charAt(i);
      }
      for (int t = s1.length(); i < s2.length(); i++) {
        result += s2.charAt(i);
      }
    } else {
      for (int i = 0; i < s2.length(); i++) {
        result += s1.charAt(i) + s2.charAt(i);
      }
      for (int t = s2.length(); i < s1.length(); i++) {
        result += s1.charAt(i);
      }
    }
    return result;
  }






}
