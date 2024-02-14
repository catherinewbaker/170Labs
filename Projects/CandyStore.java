public class CandyStore {

  public static void main(String[] args) {
    System.out.println(candies(25, 50, 100, 70));
  }

  public static String candies(int Gumdrops, int Candycorn, int Lollipops, int Snickers) {
    int gumdrops = 100;
    int candycorn = 100;
    int lollipops = 100;
    int snickers = 100;

    int[] a = new int[4];
    a[0] = gumdrops - Gumdrops;
    a[1] = candycorn - Candycorn;
    a[2] = lollipops - Lollipops;
    a[3] = snickers - Snickers;

    String result = "[";
    for (int i = 0; i < a.length - 1; i++) {
      result += a[i] + ", ";
    }
    if (a.length > 0) {
      result += a[a.length - 1]; // last element
    }
    result += "]";
    return result;
  }




}
