import java.util.Scanner;
/*
 * This class is the driver class including the main.
 * To run the project, go ahead and execute the source code in the Driver class
 * 
 * Input validation is not checked. It is assumed that the user always inputs valid values.
 */
public class Driver {
	public static void main(String[] args){
		Game Othello= new Game();
		HumanPlayer person=new HumanPlayer();
		ComputerPlayer comp=new ComputerPlayer();
		
		Scanner input=new Scanner(System.in);
		System.out.println("What size board do you want? ");	//asking the size 
		int size=input.nextInt();
		Othello.boardArray = new Board(size);					//creating object
		Othello.initializeBoard();			
		Board board= Othello.boardArray;
		
		

		char current= 'B';										
		while (Othello.ValidMoveAvailable(current)){		// program going to run until valid move is available
			Position storage;
			if (current=='B'){
				storage=person.move(Board.BoardArray);		// calling the person function; going to ask for input
			}else{
				do{
					storage=comp.move(Board.BoardArray);
				}	while(board.ValidMove(storage.x,storage.y,'W','B'));
			}
			Board.BoardArray[storage.x][storage.y] = current;
			board.printBoard();
			
			
			if (current=='B'){
				current='W';
				System.out.println("Computer's Turn Currently");//Human Player extends the super abstract class named Player
			} else current='B';
		}
		if (current=='B'){
			System.out.println("You are out of moves");
		} else System.out.println("The computer is out of moves");
		input.close();
}
	
}
