public class SearchInSortedMatrix {
    public static boolean staircaseSearch(int[][] matrix,int key){
        int i = 0;
        int j = matrix[0].length-1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == key){
                System.out.println(i+","+j);
                return true;
            }
            else if(matrix[i][j] < key){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(staircaseSearch(matrix, 33));
    }
}
