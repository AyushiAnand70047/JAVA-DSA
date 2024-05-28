public class DiagonalSum {
    public static int sum(int[][] matrix){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            int j = matrix.length-1-i;
            if(i == j){
                sum += matrix[i][i];
            }
            else{
                sum += matrix[i][i]+matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(sum(matrix));
    }
}
