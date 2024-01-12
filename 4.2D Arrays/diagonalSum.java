public class diagonalSum {
    // Approach 1 (Time Complexity: O(n^2))
    public static int diagonalSum1(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    // Approach 2 (Time Complexity: O(n))
    public static int diagonalSum2(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum1(matrix));
        System.out.println(diagonalSum2(matrix));
    }
}
