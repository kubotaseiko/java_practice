package task8_3;

public class Cleric {
	String name;
	int hp;
	final int MAX_HP = 50;
	int mp;
	final int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}
	
	public int pray (int sec) {
		int r = new java.util.Random().nextInt(3) + sec ;
		int m = Math.min(this.MAX_MP - this.mp, r);
		
		this.mp =+ m;
		return m;
	}
}
