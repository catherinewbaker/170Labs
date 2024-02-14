public class decimalToBinary {

  public static void main(String[] args) {
    System.out.println("--- decimalToBinary ---");
    System.out.println(decimalToBinary(1)); // we should expect 00000001
    System.out.println(decimalToBinary(5)); // we should expect 0000101
    System.out.println(decimalToBinary(23)); // we should expect 00010111
    System.out.println(decimalToBinary(129)); // we should expect 10000001

  }

  public static String decimalToBinary(int n) {
    String result = "";
    if (n > 255) {
      result = "number too large!";
    } else if (n >= 128) {
      n = n - 128;
      result = result + 1;
    } else if (n < 128) {
      result = result + 0;
    }

    if (n >= 64) {
      n = n - 64;
      result = result + 1;
    } else if (n < 64) {
      result = result + 0;
    }

    if (n >= 32) {
      n = n - 32;
      result = result + 1;
    } else if (n < 32) {
      result = result + 0;
    }

    if (n >= 16) {
      n = n - 16;
      result = result + 1;
    } else if (n < 16) {
      result = result + 0;
    }

    if (n >= 8) {
      n = n - 8;
      result = result + 1;
    } else if (n < 8) {
      result = result + 0;
    }

    if (n >= 4) {
      n = n - 4;
      result = result + 1;
    } else if (n < 4) {
      result = result + 0;
    }

    if (n >= 2) {
      n = n - 2;
      result = result + 1;
    } else if (n < 2) {
      result = result + 0;
    }

    if (n >= 1) {
      n = n - 1;
      result = result + 1;
    } else if (n < 1) {
      result = result + 0;
    }
    return result;
  }
}
