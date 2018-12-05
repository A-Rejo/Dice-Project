import java.util.*;

public class Die{

	private int Sides;
	private int Value;

	public Die(){
		Sides = 6;
		Value = (int)(Math.random()*Sides)+1;
	}
	public Die(int Sides){
		this.Sides = Sides;
		Value = (int)(Math.random()*Sides)+1;
	}

}