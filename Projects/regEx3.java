public class regEx3 {

  public static void main(String[] args) {
    System.out.println(regEx("I have so many things to do today! First, I am going to the store" +
    " to buy two lbs of tofu. I also need two muffins. Second, I am going to the bank to" +
    " withdraw two hundred dollars. Third, I need to pick up my two dogs from the kennel." +
    " They've been there for too long! Lastly, I need to visit my sick friend, Tommy."));
  }

  public static String regEx(String a) {
    a = a.replaceAll("(\\s)([tT])([wW])([oO])(\\s)", " 2 "); // takes out "two"
    a = a.replaceAll("(\\s)([tT])([oO]+)(\\s)", " 2 "); // takes out "too" and "to"
    return a;
  }
}
