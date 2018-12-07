public class Die{

	private int sides;
	private int value;

	public Die(){
		sides = 6;
		value = (int)(Math.random()*(sides-1))+1;
	}
	public Die(int sides, int value){
		this.sides = sides;
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public int getSides(){
		return sides;
	}
	public void roll(){
		value = (int)(Math.random()*(sides-1))+1;
	}
	public String toString(){
		return "Number of sides: "+sides+", Value: "+getValue();
	}

}