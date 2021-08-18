package book2;

public class SuperHero extends Hero10 {
	boolean flying;
	public void fry() {
		this.flying = true;
		System.out.println("飛び上がった!");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
}
