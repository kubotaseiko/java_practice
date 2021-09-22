package task17_2;

import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("data.text");
		int input = fr.read();
		while (input != -1) {
			System.out.print((char)input);
			input = fr.read();
		}
		fr.close();
	}
}
