public class validEmailAddress {

  public static void main(String[] args) {
    System.out.println(isValidEmail("user_123@gmail.com")); // returns true
    System.out.println(isValidEmail("user123alpha@gmail.com")); // returns false
  }

  public static boolean isValidEmail(String a) {
    if ( ! (a.substring(0, 1)).matches("([a-zA-Z])")) { // confirms that the first character is a letter
      return false; // if it doesn't, false is returned
    } else if ( ! (a.matches("(\\w{1,10})(@)([a-z]([a-zA-Z\\d]{1,12}))(\\.)([a-z]{1,3})"))) { // super long regex that confirms the email follows proper convention
      return false; // if it doesn't, false is returned
    }
    return true; // if the email follows all convention, the if loop is escapes and true is returned
  }
}
