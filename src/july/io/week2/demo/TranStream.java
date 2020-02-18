package july.io.week2.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TranStream {

	public static void main(String[] args) throws IOException {
		readKey();
		
	}

	public static void readKey() throws IOException {
		InputStream in = System.in;
		InputStreamReader is = new InputStreamReader(in);
		BufferedReader sf = new BufferedReader(is);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null ;
		while((line=sf.readLine())!=null) {
			if("over".equals(line)) {
				break ;
			}
			bw.write(line.toUpperCase());
			bw.newLine();
			bw.flush();
		}		
		
	}

}
