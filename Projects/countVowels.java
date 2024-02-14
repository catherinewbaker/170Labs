public class Mystery {

  public static void main(String[] args) {
    System.out.println(countVowels("happy")); // 1
    System.out.println(countVowels("barbeque")); // 4
    System.out.println(countVowels("aabcfaye")); // 4
    System.out.println(countVowels("linEar")); // 3
    System.out.println(countVowels("EstAtic")); // 3
  }

  public static int Mystery(String s) {
    int result = 0;
    String a = s.toLowerCase(); // this makes it so that my if loop can be shorter
    for (int i = 0; i < a.length(); i++) { // 9 < a.length is because the index will be one number less than the length
      if (a.charAt(i) == 'o') {
        result += 1;
      } else if (a.charAt(i) == 'a') {
        result += 1;
      } else if (a.charAt(i) == 'e') {
        result += 1;
      } else if (a.charAt(i) == 'i') {
        result += 1;
      } else if (a.charAt(i) == 'u') { // parses each letter for each vowel
        result += 1; // this adds 1 to result every time a vowel is found
      }
    }
    return result;
  }
}
