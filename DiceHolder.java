import java.util.*;
public class DiceHolder{
	private ArrayList<Die> dice;
		public DiceHolder(){
		dice = new ArrayList<Die>();
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
	public int addDie(Die x){
		if(dice.size()<6){
			dice.add(x);
			return 1;
		}
		return -1;
	}




}