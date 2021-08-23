package task11;

public class Matango {
	int hp = 50;
	char suffix;
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("");
		System.out.println("");
		h.hp -= 10;
	}
}
