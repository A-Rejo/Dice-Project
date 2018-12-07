import java.util.*;
public class DiceRunner{
	public static void main(String [] args){
		//Test 1
		Die die1 = new Die();
		Die die2 = new Die();
		int count = 1;
		do{
			die1.roll();
			die2.roll();

			System.out.println("Roll #: "+count+"\n"+die1.toString()+"\n"+die2.toString()+"\n");

			count++;
		}while(((die1.getValue() != 1) || (die2.getValue() != 1)));

	}
}