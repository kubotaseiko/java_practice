package task9_2;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "���̌�";
		s.damage = 10;
		Hero h1 = new Hero();
		h1.name = "�~�i�g";
		h1.hp = 100;
		h1.sword = s;
		System.out.println("���݂̕����" + h1.sword.name);
		System.out.println(h1.name + "�́A" + h1.sword.name + "�ōU������" );

		Hero h2 = new Hero();
		h2.name = "�A�T�J";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "�X�K����";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.name + "��HP�́A" + h1.hp);
		System.out.println(h2.name + "��HP�́A" + h2.hp);
	}
}
