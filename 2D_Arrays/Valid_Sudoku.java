public class Valid_Sudoku {
    public boolean checkvalid(char[][] board,int i,int j){
        // row and col
        for(int k=0;k<9;k++){
            if(k!=i && k!=j){
                if( board[i][j]==board[k][j] || board[i][j]==board[i][k])
                    return false;                
            }
        }
        // sub block
        int n=board.length;
        int root_n=(int)Math.sqrt(n);
        int ri=(i/root_n)*root_n;
        int rj=(j/root_n)*root_n;
        for(int x=ri;x<ri+root_n;x++){
            for(int y=rj;y<rj+root_n;y++){
                if(x!=i && y!=j){
                    if(board[x][y]==board[i][j])
                        return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j]!='.'){
                    if(!checkvalid(board,i,j))
                        return false;
                }

            }
        }
        return true;
        
    }
}