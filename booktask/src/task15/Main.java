package task15;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i+1).append(",");
		}
		String s = sb.toString();
		System.out.println(s);
		String[] a = s.split(",");
		System.out.println(a[1]);
	}
}