public class SudokuCode {

    public static boolean isSafe(int[][] sudoku,int row,int col,int digit){
        // column condition
        for(int i=0;i<9;i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        // row condition
        for(int j=0;j<9;j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        // grid (3x3)
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int[][] sudoku,int row,int col){
        if(row == 9){
            return true;
        }
        int nextRow = row, nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int[][] sudoku){
        
        for(int i=0;i<9;i++){
            if(i%3==0){
                System.out.println("-----------------------");
            }
            for(int j=0;j<9;j++){
                if(j==3 || j==6 ){
                    System.out.print("| ");
                }
                System.out.print(sudoku[i][j]+" ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = { {0,0,0,3,0,6,0,9,0},
        {0,0,2,0,0,0,5,0,0},
        {0,0,0,0,0,0,0,0,0},
        {6,0,0,0,7,0,4,0,0},
        {0,9,0,0,5,0,0,0,0},
        {3,8,0,0,0,0,0,0,0},
        {0,0,5,0,0,0,2,0,7},
        {0,0,0,8,0,0,0,0,0},
        {0,0,0,9,0,0,0,0,0} };

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exist");
        }
    }   
}
