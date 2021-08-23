package task11;

public class Dancer extends Character {
	public void dance () {
		System.out.println(this.name + "は情熱的に踊った");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "のダメージ");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
}
