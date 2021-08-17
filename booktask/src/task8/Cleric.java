package task8;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int sec) {
		System.out.println(this.name +"が" + sec + "秒間、祈った");
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("mpが" + this.mp + "まで回復した");
		return recoverActual;
	}
}
