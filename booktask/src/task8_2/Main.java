package task8_2;

public class Main {
	public static void main(String[] args) {
		Cleric test = new Cleric();
		test.name = "test";
		test.hp = 20;
		test.mp = 2;
		
		test.selfAid();
		test.pray(3);
		}

}
