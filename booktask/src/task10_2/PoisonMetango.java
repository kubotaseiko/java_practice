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
		System.out.println("�L�m�R" + this.suffix + "�̍U��");
		System.out.println("10�̃_���[�W");
		System.out.println("����ɓł̖E�q���΂�܂����I");
		System.out.println(attacPoint + "�|�C���g�̃_���[�W");
	}
}

