public class SearchInMatrix {
    public static boolean search(int[][] matrix,int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(search(matrix, 5));
    }
}
