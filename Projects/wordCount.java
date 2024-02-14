public class wordCount{

  public static void main(String[] args) {
    System.out.println(wordCount("I am happy")); // 3
    System.out.println(wordCount("I   am   happy")); // 3
    System.out.println(wordCount("Being happy   is  fun ")); // 4
    System.out.println(wordCount("")); // 0
  }

  // This method counts the number of words in a string regardless of the spacing
  public static int wordCount(String s) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) { // runs the loop for as long as the string is
      if ((i == s.length() - 1) || (s.charAt(i) == (' ')) && (s.charAt(i + 1) != ' ')) { // first section says
      // "if the index i = the last index of the string, add 1", this is because I do not include the first word
      // in my strings. The second section says "if this char = ' ' and the char right next to it is a letter
      // then add 1". THis makes it so that the start of every word is included.
        result += 1;
      }
    }
    return result;
  }
}
