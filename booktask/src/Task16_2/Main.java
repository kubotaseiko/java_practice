package Task16_2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> list = new ArrayList<Hero>();
		list.add(h1);
		list.add(h2);
		for(Hero n : list) {
			System.out.println(n);
		}
	}
}
