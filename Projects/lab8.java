class lab8 {

	public static void main(String[] args){
		// Test Case 1
		int mat[][] = {
			{ 1, 2, 3, 4 },
			{ 5, 6, 7, 8 },
			{ 9, 10, 11, 12 },
			{ 13, 14, 15, 16 }
		};
		displayMatrix(mat);
		rotateImage(mat);
		displayMatrix(mat);

		// Tese Case 2
		 int mat2[][] = {
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
						};
		  displayMatrix(mat2);
			rotateImage(mat2);
			displayMatrix(mat2);


		// Tese Case 3
		int mat3[][] = {
						{1, 2},
						{4, 5}
					};
		displayMatrix(mat3);
		rotateImage(mat3);
		displayMatrix(mat3);


	}

  // An Inplace function to
  // rotate a N x N matrix
  // by 90 degrees in
  //clockwise direction
	public static void rotateImage(int matrix[][]){
		int[][] matrix2 = new int [matrix[0].length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[0].length; k++) {
				matrix2[i][k] = matrix[matrix.length - (k + 1)][i];
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			matrix[j] = matrix2[j];
		}
  }

  // Function to print the matrix
  static void displayMatrix(int mat[][]){
		int N = mat.length;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++)
        System.out.print(" " + mat[i][j]);
      System.out.print("\n");
    }
    System.out.print("\n");
  }
}
