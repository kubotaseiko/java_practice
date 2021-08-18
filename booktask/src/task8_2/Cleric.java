package task8_2;

public class Cleric {
	String name;
	int hp;
	int maxHp = 50;
	int mp;
	int maxMp = 10;

	public void selfAid() {
		this.hp += 5;
		this.hp = maxHp;
		System.out.println("HPが5ポイント回復した！");
	}
	public int pray(int sec) {
		int recovery = new java.util.Random().nextInt(3) + sec;
		int recoveryActual = Math.min(this.maxMp - this.mp, recovery);

		this.mp += recoveryActual;
		System.out.println("MPが" + recoveryActual + "ポイント回復した！");
		return recoveryActual;
	}
}
