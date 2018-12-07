import java.util.*;
public class DiceHolder{

		ArrayList<Die> dice = new ArrayList<Die>();

		public DiceHolder(){
		this.dice = dice;
	}
	public void Shake(){
		Die temp;
		for(int i = 0; i < dice.size(); i++){
			int index = (int)
		(Math.random()*dice.size()-1)+0;
		temp = dice.get(index);
		dice.set(i, dice.get(index));
		dice.set(index, temp);
	}
}
	public int addDie(Die die){
		if(dice.size()<6){
			dice.add(die);
			return 1;
		}
		return -1;
	}

	public String toString(){
		String st = ("");
			for(int i = 0; i < dice.size(); i++){
			st += dice.get(i)+"\n";
		}
		return st;
	}


}