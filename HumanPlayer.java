import java.util.Scanner;

public class HumanPlayer extends Player {		//Human Player extends the super abstract class named Player
	int x;
	int y;
	char color = 'B';
	

	@Override
	public Position move(char[][] Board) {		//Position method overridden; asks player to input the values until valid length is inputed
		
		@SuppressWarnings("resource")
		Scanner input=new Scanner (System.in);
		do{
			System.out.println("Enter a row (input 0 for row 1 and so on: ");
			x=input.nextInt();
			System.out.println("Enter a column: input 0 for column 1 and so on");
			y=input.nextInt();
			
		} while (x<0 && y<0 && x>Board.length && y> Board.length);
		
		return new Position(x,y);
		
		
	}}
