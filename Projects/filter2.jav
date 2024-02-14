public class filter2 {

  public static void main(String[] args) {
    System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", new String[]{"duck", "ship", "whole"}));
  }

  public static String swearFilter(String text, String[] swear) {
    for (int i = 0; i < text.length() - 1; i++) {
      for (int j = 0; j < swear.length; j++) {
        if ((text.substring(i, (i + swear[j].length()))).equals(swear[j])) {
          for (int k = i + 1; k < i + swear[j].length() - 1; k++) {
            text.replace(text.charAt(k), '*'); // need more direction here
          }
        }
      }
    }
    return text;
  }

}
