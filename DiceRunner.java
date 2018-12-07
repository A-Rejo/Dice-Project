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

		//Test 2
		ArrayList <Die> die = new ArrayList<Die>();
		DiceHolder diceholder = new DiceHolder();

		System.out.println("Contents of Holder");
		for(int i = 0; i < 6; i++){
			int star = (int)(Math.random()*20)+1;
			int star1 = (int)(Math.random()*6)+1;
			diceholder.addDie(new Die(star, star1));
			System.out.println(diceholder);
		}
		System.out.println("After Shaking: \n");
		diceholder.Shake();
		System.out.println(diceholder.toString());
	}
}