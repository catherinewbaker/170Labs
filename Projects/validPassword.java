public class validPassword {

  public static void main(String[] args) {
    System.out.println(isValidPassword("Tr7s6d_")); // returns true
    System.out.println(isValidPassword("@abc2-bc")); // returns false
    System.out.println(isValidPassword("ALphaa%")); // returns false
  }

  public static boolean isValidPassword(String a) {
    if (a.length() > 8 || a.length() < 6) { // false if not in correct length
      return false;
    } else if ( ! (a.substring(0, 1)).matches("([A-Z!@#])")) { // false is first letter isn't !, @, #, or a capital letter
      return false;
    } else if ( ! (a.substring(1, a.length() - 1)).matches("(\\w*)")) { // false if the cahracters following the first letter aren't word characters
      return false;
    } else if ((a.substring(a.length() - 1, a.length())).matches("([\\*\\.%])")) { // false if the password's last character is *, ., or %
      return false;
    } else if (a.contains("(\\s)")) { // false if password contains a space
      return false;
    }
    return true; // if the password passes all the checks, it becomes true
  }
}
