package testing1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		TextFileIO.writeTextFile("C:\\Users\\nugget\\Desktop\\test", "Hunter is a loser.\nKyle is cool.");
		
		TextFileIO.readTextFile("C:\\Users\\nugget\\Desktop\\test");
	}

}