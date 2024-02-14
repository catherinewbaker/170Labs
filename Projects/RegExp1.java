public class RegExp1 {

  public static void main(String[] args) {
    String s = "dancer";
    System.out.println("\"danser\" returns: " + s.matches("dancer")); // true
    System.out.println("\"danc.*\" returns: " + s.matches("danc.*")); // true
    System.out.println("\"dance[rR]\" returns: " + s.matches("dance[rR]")); // true
    System.out.println("\"dance[rR]|singer\" returns: " + s.matches("dance[rR]|singer")); // true
    System.out.println("\"\\w{6}\" returns: " + s.matches("dance[rR]|singer")); // true
  }

}
