package task16_2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(h1);
		heros.add(h2);

		for (Hero h : heros) {
			System.out.println(h.getName());

		}
		Map<Hero,Integer> heros2 = new HashMap<Hero,Integer>();
		heros2.put(h1, 3);
		heros2.put(h2, 7);
		for (Hero key : heros2.keySet()) {
			int value = heros2.get(key);
			System.out.println(key.getName() + "の人口は、" + value);
		}
	}

}
