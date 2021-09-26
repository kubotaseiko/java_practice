package task18_2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("task18_2/data.txt");
		try {
			fw.write('そ');
			fw.write('れ');
			fw.write('で');
			fw.write('は');
		} catch (IOException e){
			System.out.println("何らかの例外が発生しました");
		} finally {
			try {
				fw.close();
			} catch(IOException e) {
				;
			}
		}
	}
}
