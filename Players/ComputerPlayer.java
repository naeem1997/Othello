
public class ComputerPlayer extends Player {	//Computer Player extends player and overrides the move
												// move function 

	@Override
	Position move(char[][] Board) {
		return new Position((int)Math.random()*Board.length, (int)Math.random()*Board.length);
			// randomly generates a row and column 
	}
	

}
