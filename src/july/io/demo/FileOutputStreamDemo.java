package july.io.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
		public static void main(String[] args) throws IOException {
			FileOutputStream op = new FileOutputStream("D:/C/11.jpg");
			FileInputStream ip = new FileInputStream("d:\\FullSizeRender(13).jpg");
			byte[] b = new byte[1024];
			int len = 0;
			while((len = ip.read(b))!=-1) {
				op.write(b);
				
			}
			op.close();
			ip.close();
			
			
		}
		
}
