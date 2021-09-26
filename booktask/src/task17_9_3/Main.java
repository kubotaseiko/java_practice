package task17_9_3;

public class Main {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");

		}catch(NumberFormatException e){
			System.out.println("NumberFormatExceptionの例外処理をcatchしました");
		}
	}
}
