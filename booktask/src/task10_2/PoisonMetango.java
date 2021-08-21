package task10_2;

public class PoisonMetango extends Matango {
	
	public PoisonMetango() {
		super('A');
	}
	
	public void attac(Hero h) {
		int count = 5;
		int attacPoint = (h.hp / 5);
		if (this.count < 5) {
			
			this.count -= 1;
		}
		h.hp -= 10;
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		System.out.println("さらに毒の胞子をばらまいた！");
		System.out.println(attacPoint + "ポイントのダメージ");
	}
}

