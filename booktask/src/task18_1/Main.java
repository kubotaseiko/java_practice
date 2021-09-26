package task18_1;

import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("task18_1/data.txt");
		try {
			int input = fr.read();
			while (input != -1) {
				System.out.print((char)input);
				input = fr.read();
			}
		} catch (IOException e){
			System.out.println("何らかの例外が発生しました");
		}finally {
			try {
				fr.close();
			} catch(IOException e) {
				;
			}
		}
	}
}