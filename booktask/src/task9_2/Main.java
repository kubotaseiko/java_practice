package task9_2;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		h1.sword = s;
		System.out.println("現在の武器は" + h1.sword.name);
		System.out.println(h1.name + "は、" + h1.sword.name + "で攻撃した" );

		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.name + "のHPは、" + h1.hp);
		System.out.println(h2.name + "のHPは、" + h2.hp);
	}
}
