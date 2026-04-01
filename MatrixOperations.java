class MatrixOperations {
    int[][] a = new int[3][3];
    // Constructor
    MatrixOperations(int[][] x) {
        a = x;
    }
    // Display matrix
    void display() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Transpose
    void transpose() {
        for(int i = 0; i < 3; i++) {
            for(int j = i; j < 3; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    // Sum of two matrices
    static MatrixOperations add(MatrixOperations m1, MatrixOperations m2) {
        int[][] res = new int[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                res[i][j] = m1.a[i][j] + m2.a[i][j];

        return new MatrixOperations(res);
    }
    // Multiplication
    static MatrixOperations multiply(MatrixOperations m1, MatrixOperations m2) {
        int[][] res = new int[3][
