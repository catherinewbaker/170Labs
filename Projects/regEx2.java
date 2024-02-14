public class regEx2 {

  public static void main(String[] args) {
    regEx("I have so many things to do today! First, I am going to the store" +
    "to buy two lbs of tofu. I also need two muffins. Second, I am going to the bank to" +
    "withdraw two hundred dollars. Third, I need to pick up my two dogs from the kennel." +
    "They've been there for too long! Lastly, I need to visit my sick friend, Thomas.");
  }

  public static String regEx(String a) {
    a = a.replaceAll("([tT])([wW])([oO])", "2");
    a = a.replaceAll("([tT])([oO]+)", "2");
    return a;
  }
}
