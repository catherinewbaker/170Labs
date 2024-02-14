public class letterCount {

  public static void main(String[] args) {
    System.out.println(letterCount("happy", "p")); // 2
    System.out.println(letterCount("backyard barbeque", "b")); // 3
    System.out.println(letterCount("abc-123-abc-ABC", "b")); // 2
    System.out.println(letterCount("This is interesting!", "z")); // 0
    System.out.println(letterCount("", "q")); // 0
  }

  // counts the number of times c appears in s
  public static int letterCount(String s, String c) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) { // runs the for loop for as long as the length of the string
      if ((s.substring(i, (i + 1))).equals(c)) { // compare the letter in each position of s to c
        result += 1; // adds one to result if they ar ethe same
      }
    }
    return result;
  }
}
