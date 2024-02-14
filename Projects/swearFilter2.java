public class swearFilter2 {

  public static void main(String[] args) {
    System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", new String[]{"duck", "ship", "whole"}));
  }

  public static String swearFilter(String text, String[] swear) {
    int count = 0;
    for (int i = 0; i < text.length() - 1; i++) { // runs the following through each interval of text
      for (int j = 0; j < swear.length; j++) { // runs the following through each swear word
        if ((i + swear[j].length()) > text.length()) { // skips if the interval is out of bounds
          continue;
        } else if (((text.substring(i, i + swear[j].length())).toLowerCase()).compareTo((swear[j]).toLowerCase()) == 0) { // compares the words in text to the swear words
          count++;
        }
      }
    }

    String[] swear2 = new String[count];
    for (int i = 0; i < text.length() - 1; i++) { // runs the following through each interval of text
      for (int j = 0; j < swear2.length; j++) { // runs the following through each swear word
        for (int q = 0; q < swear.length; q++) {
          if ((i + swear[q].length()) > text.length()) { // skips if the interval is out of bounds
            continue;
          } else if (((text.substring(i, i + swear[q].length())).toLowerCase()).compareTo((swear[q]).toLowerCase()) == 0) { // compares the words in text to the swear words
            swear2[j] = "";
            //swear2[j] += text.substring(i, i + 1);
            for (int k = i + 1; k < i + swear[q].length() - 1; k++) { // asterik for loop
              swear2[j] += text.substring(k - 1, k + swear[q].length() - 1).replaceAll(text.substring(k, k + 1), "*"); // replaces each word with the first letter, asteriks, and the last letter
            }
            //swear2[j] += text.substring(i + swear[q].length() - 1, i + swear[q].length());
          }
        }

      }
    }



    for (int i = 0; i < swear.length; i++) {
      String pattern = "(\\w*)(" + swear[i] + ")(\\w*)"; // how to make this case insensitive
      text = text.replaceAll(pattern, "$1" + swear2[i] + "$3");
    }
    return text;


  }
}
