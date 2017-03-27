
abstract public class Player {				//abstract Player class implemented so it can be extended to either type of player: Computer or Human	
	char color;

	
	abstract Position move(char[][]Board);  ////Since Player is an abstract class, Position method is unimplemented
	
	void setColor(char color){			// basic getter and setter methods
		this.color=color;
	}
	
	char getColor(){
		
		return color;
		
	}

}
