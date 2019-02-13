package testing1;

import java.io.*;

public class TextFileIO {
	public static void writeTextFile(String fileName, String msg) {
		try {
			FileWriter fw = new FileWriter(fileName+".txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.print(msg);
			
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readTextFile(String fileName) throws IOException {
		try {
			FileReader fr = new FileReader(fileName + ".txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
