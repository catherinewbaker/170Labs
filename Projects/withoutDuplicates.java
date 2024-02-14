public class withoutDuplicates {

  public static void main(String[] args) {
  System.out.println(arrayToString(withoutDuplicates(new int[]{1, 2, 3}))); // returns {1, 2, 3}
  System.out.println(arrayToString(withoutDuplicates(new int[]{1, 2, 1, 1, 3, 2, 3}))); // returns {1, 2, 3}
  System.out.println(arrayToString(withoutDuplicates(new int[]{3, 9, 3, 4,4,5,9})));
  }

  public static int[] withoutDuplicates(int[] a) {
    int[]b = new int[a.length+1];
    int j =0;
    b[0] = a[0]; // this and the previous 2 lines set int[] b up to be the same as int[] a
    for (int i = 1; i < a.length; i++) {
        int flag = 0;
        for(int k =0; k<a.length;k++){
           if(a[i]==b[k]){
             flag = 1; // makes int flag 1 if two positions are equal to each other
             break;
           }
         }
        if(flag==0){
          j = j+1;
          b[j] = a[i]; // if there is no flag, the element at that a[i] is added to b
        }
    }
    b[b.length-1] = 0; // makes the end of the arrays zeros
    return b; // returns the copy
  }

  // method that was created in class to show our arrays
  public static String arrayToString(int[] a) {
    String result = "{" + a[0];
    for (int i = 1; i < a.length - 1; i++) {
      if (a[i] != 0) {
        result = result + ", " + a[i];
      }
    }
    result += "}";
    return result;
  }

}
