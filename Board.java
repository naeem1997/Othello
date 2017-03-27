
public class Board {
	
	static char [][] BoardArray;			
	static int size;
	char black= 'B';
	char white= 'W';
	int row, col;
	
	
	Board(){									//default constructor calling the parameterized constructor
		this(4);
	}
	
	Board (int size){
		Board.size=size;
		BoardArray=new char [size][size];// initializing board
		initializeBoard();
		
	}
	 void printBoard() {							
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				System.out.print(BoardArray[i][j]);
			}
			System.out.println();// initializing board
		}		
	}
	
	public void initializeBoard(){					// initializing board
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				BoardArray[i][j]='_';
			}
		}	
		BoardArray[size/2 -1][size/2 -1]='W';
		BoardArray[size/2 -1][size/2]= 'B';
		BoardArray[size/2][size/2 -1]= 'B';
		BoardArray[size/2][size/2]= 'W';
		
	}
	boolean ValidMove(int row, int col, char color, char othercolor){		// checking to see if it's a valid move
		if (row >= size || row < 0 || col>=size || col<0){
			return false;
		}
		else
			if ( checkUp(row,col,color,othercolor, true) || checkLeft(row,col,color,othercolor, true)|| 
					checkRight(row,col,color,othercolor, true)|| checkDown(row,col,color,othercolor, true)){
				return true;
	}
			else return false;
	}
	
		
	boolean checkUp (int row, int col, char color, char othercolor, boolean update){
		if (row<2) return false;							// this method checks if the move is valid move
		if (color=='B'){
				if(BoardArray[row-1][col]==othercolor){
					if (BoardArray[row-2][col]==color){
						if(update){		// this method checks if the move is a valid
							BoardArray[row-1][col]=color;
						}
						return true;
					}
					else return false;
				}
				
			}
		else if (color=='W'){
			if(BoardArray[row-1][col]==othercolor){//Human Player extends the super abstract class named Player
				if (BoardArray[row-2][col]==color){
					if(update)BoardArray[row-1][col]=color;// initializing board
					return true;
				}
				else return false;
			}
			
		}
		
		return false;	
			
			
		}
	
	boolean checkDown(int row, int col, char color, char othercolor, boolean update){// this method checks if the move is a valid move in the Down direction
		if(row>size-3) return false;
		if (color=='B'){
			if(BoardArray[row+1][col]==othercolor){
				if (BoardArray[row+2][col]==color){		//
					if(true)BoardArray[row+1][col]=color;
					return true;
				}
				else return false;
			}
			
		}
	else if (color=='W'){
		if(BoardArray[row+1][col]==othercolor){			// initializing board
			if (BoardArray[row+2][col]==color){
				if(update)BoardArray[row+1][col]=color;
				return true;
			}
			else return false;
		}
		
	}
	
	return false;
		
	}
	
	boolean checkLeft(int row, int col, char color, char othercolor, boolean update){// this method checks if the move is a valid in the left direction
		if (col<2) return false;
		if (color=='B'){
			if(BoardArray[row][col-1]==othercolor){
				if (BoardArray[row][col-2]==color){
					if(update)BoardArray[row][col-1]=color;
					return true;
				}
				else return false;
			}
			
		}
	else if (color=='W'){
		if(BoardArray[row][col-1]==othercolor){
			if (BoardArray[row][col-2]==color){
				if(update)BoardArray[row][col-1]=color;
				return true;
			}
			else return false;
		}
		
	}
	
	return false;
		
	}
	
	boolean checkRight(int row, int col, char color, char othercolor, boolean update){// this method checks if the move is a valid move in the right direction
		if (col>size-3) return false;
		if (color=='B'){
			if(BoardArray[row][col+1]==othercolor){
				if (BoardArray[row][col+2]==color){
					if(update)BoardArray[row][col+1]=color;
					return true;
				}
				else return false;
			}
			
		}
	else if (color=='W'){// initializing board
		if(BoardArray[row][col+1]==othercolor){
			if (BoardArray[row][col+2]==color){
				if(update)BoardArray[row][col+1]=color;
				return true;
			}
			else return false;
		}
		
	}
	
	return false;
	}
	
	}

