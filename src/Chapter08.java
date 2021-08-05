
public class Chapter08 {
	public static void main(String[] args) {
		int a = 2;
		while ( (1 <= a) && (a < 5) ) {
			a *= a;
			System.out.println( "Chapter08 = " + a );
		}
		
		int[] b = { 10, 25, 35, 40 };
		
		for (int number1 = 0; number1 < b.length; number1++ ) {
			System.out.println(b[number1]);
		}
		
		for ( int number : b) {
			if (number % 2 == 0){
				continue;
			}
			System.out.println(number);
		}
	}

}
