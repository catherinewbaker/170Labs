public class charityFund {

  public static void main(String[] args) {
//    System.out.println(money(9.37)); // (TC1) we should expect donation = 10 and donation - cost = .63
//    System.out.println(money(10.84)); // (TC2) we should expect donation = 20 and donation - cost = 9.16
//    System.out.println(money(20.22)); // (TC3) we should expect donation = 30 and donation - cost = 9.78
//    System.out.println(money(34.64)); // (TC4) we should expect donation = 40 and donation - cost = 5.36
    System.out.println(money(48.15)); // (TC5) we should expect donation = 50 and donation - cost = 1.85

  }

  public static String money(double cost) {
    double donation = 0.0;
    if (cost < 10) {
      donation = 10;
    } else if (cost < 20) {
      donation = 20;
    } else if (cost < 30) {
      donation = 30;
    } else if (cost < 40) {
      donation = 40;
    } else if (cost < 50) {
      donation = 50;
    }
    String string_donation = String.valueOf(donation);
    String message = "Thank you for donating! Your total was " +"$"+ cost + ",but becomes " + "$" + string_donation + " with your donation. You donated " + "$" + (donation - cost);
    return message;
  }






}
