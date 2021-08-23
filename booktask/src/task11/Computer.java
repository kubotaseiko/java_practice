package task11;

public abstract class Computer extends TangibleAsset {
	String makerName;

	public Computer(String name, int price, String color, String makerName){
		super(name, price, color);
		this.makerName = makerName;
	}
	public String getIsbn() { return this.makerName; }
}
