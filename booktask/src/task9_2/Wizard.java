package task9_2;

public class Wizard {
	String name;
	int hp;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "��HP��10�񕜂���");
	}
}
