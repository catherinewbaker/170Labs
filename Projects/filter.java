public class filter {

  public static void main(String[] args) {
    System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", new String[]{"duck", "ship", "whole"}));
    System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", new String[]{"sail", "wheat", "bread"}));
    System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", new String[]{"that", "ping", "was"}));

  }

  public static String swearFilter(String text, String[] swear) {
    for (int i = 0; i < text.length() - 1; i++) { // runs the following through each interval of text
      for (int j = 0; j < swear.length; j++) { // runs the following through each swear word
        if ((i + swear[j].length()) > text.length()) { // skips if the interval is out of bounds
          continue;
        } else if (((text.substring(i, i + swear[j].length())).toLowerCase()).compareTo((swear[j]).toLowerCase()) == 0) { // compares the words in text to the swear words
          for (int k = i + 1; k < i + swear[j].length() - 1; k++) { // asterik for loop
            text = text.substring(0, k) + "*" + text.substring(k + 1, text.length()); // replaces each word with the first letter, asteriks, and the last letter
          }
        }
      }
    }
    return text;
  }
}
