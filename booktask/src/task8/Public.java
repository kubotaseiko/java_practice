package task8;

public class Public {
	public static void main(String[] args) {
		Cleric h1 = new Cleric();
		h1.name = "てすと";
		h1.hp = 50;
		h1.mp = 10;

		h1.selfAid();
		h1.pray(1);

	}
}
