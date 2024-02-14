public class newCar {

/*
Which car would you buy if you plan on keeping it for five years?
  If I were only keeping the car for 5 years, I would buy Car A, because it is
  about $6,000 cheaper.

Which car would you buy if you plan on keeping it for ten years?
  If I were keeping the car for 10 years, according to my chart, I would buy car B, because
  the price is cheaper.

In a method, what is the difference between printing something and returning it?
  Printing is much freer than returning something. You can only return things at the end of
  the method, almost like a sort of conclusion. Printing can be done at any point throughout
  a method and can also be done in the main method. Return is like the result of the method
  and is required with specific methods whereas printing is affects nothing but what you
  read on the terminal. One is a required culmination of a method and the other is just
  something we use to print out variables and information.
*/
  public static void main(String[] args) {
    tableTop();
//    compareCars(5); // Test Case 1
    compareCars(10); // Test Cast 2
  }

  public static void tableTop() {
    String title = "(years)     (Car A cost)        (Car B cost)"; // header
    System.out.println(title);
  }

  public static void compareCars(int years) {
    String year = "year";
    double carACost = 20000;
    double carAgas = ((15000.0 / 25) * 2.50); // equation for gas
    double carAMaintenance = 1300;
    double carBCost = 30000;
    double carBgas = ((15000.0 / 32) * 2.50); // equation for gas
    double carBMaintenance = 1000;
    System.out.println(" " + year + " 0" + "       " + carACost + "             " + carBCost); // year 0 - printed because I could not figure out how to incorporate it into the for loop
    System.out.println(" " + year + " 1" + "       " + (carACost + carAgas + carAMaintenance) + "             " + (carBCost + carBgas + carBMaintenance)); // year 1 - printed because I could not figure out how to incorporate it into the for loop
    for (int i = 2; i <= years; i++) {
      carAMaintenance *= 1.15; // equations for compound maintenance
      carBMaintenance *= 1.1;
      if (i == 2) {
        System.out.println(" " + year + " " + i + "       " + (carACost + (carAgas * i) + carAMaintenance) + "             " + (carBCost + (carBgas * i) + carBMaintenance));
      } else if (i == 3) {
        System.out.println(" " + year + " " + i + "       " + (carACost + (carAgas * i) + carAMaintenance) + "          " + (carBCost + (carBgas * i) + carBMaintenance));
      } else if (i == 4) {
        System.out.println(" " + year + " " + i + "       " + (carACost + (carAgas * i) + carAMaintenance) + "    " + (carBCost + (carBgas * i) + carBMaintenance));
      } else {
        System.out.println(" " + year + " " + i + "       " + (carACost + (carAgas * i) + carAMaintenance) + "   " + (carBCost + (carBgas * i) + carBMaintenance));
      } // the if loop adjusts the spacing for the decimals
    }
  }
}
