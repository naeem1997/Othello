
public class Game {

	public int count=0;
	HumanPlayer player= new HumanPlayer();
	Board boardArray= new Board();
	
	public int getPlayerNumPieces(int size, char color){
	for (int i=0; i< size; i++){
		for (int j=0; j<size; j++){
			if (Board.BoardArray[size][size]==color){
				count++;
			}
		}
	}
	return count;
	
}
	public void initializeBoard(){
		boardArray.printBoard();
		
		
	}
	
	public boolean ValidMoveAvailable(char color){
		boolean flag = false;
		if (color == 'B'){
			for (int i = 0; i < 4; i++){
				if (boardArray.checkDown(0, i, color, 'W', false)){
					flag = true;
					break;
				}
				if (boardArray.checkDown(1,i,color,'W', false)){
					flag = true;
					break;
				}
				if (boardArray.checkUp(3,i,color,'W', false)){
					flag = true;
					break;
				}
				if (boardArray.checkUp(4,i,color,'W', false)){
					flag = true;
					break;
				}
			}
			for (int i=0; i<4; i++){
				if (boardArray.checkRight(i,0, color, 'W', false)){
					flag = true;
					break;
				}
				if (boardArray.checkRight(i,1,color,'W', false)){
					flag = true;
					break;
				}
				if (boardArray.checkLeft(i,3,color,'W', false)){
					flag = true;
					break;
				}
				if (boardArray.checkLeft(i,4,color,'W', false)){
					flag = true;
					break;
				}
				
			}
			
		} else {
			for (int i = 0; i < 4; i++){
				if (boardArray.checkDown(0, i, color, 'B', false)){
					flag = true;
					break;
				}
				if (boardArray.checkDown(1,i,color,'B', false)){
					flag = true;
					break;
				}
				if (boardArray.checkUp(3,i,color,'B', false)){
					flag = true;
					break;
				}
				if (boardArray.checkUp(4,i,color,'B', false)){
					flag = true;
					break;
				}
			}
			for (int i=0; i<4; i++){
				if (boardArray.checkRight(i,0, color, 'B', false)){
					flag = true;
					break;
				}
				if (boardArray.checkRight(i,1,color,'B', false)){
					flag = true;
					break;
				}
				if (boardArray.checkLeft(i,3,color,'B', false)){
					flag = true;
					break;
				}
				if (boardArray.checkLeft(i,4,color,'B', false)){
					flag = true;
					break;
				}
				
			}
			
			
		}

		return flag;
		
	}


}
