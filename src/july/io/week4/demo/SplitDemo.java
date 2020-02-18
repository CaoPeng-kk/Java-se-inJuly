package july.io.week4.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class SplitDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\FullSizeRender(13).jpg");
		splitFile(f);
	}

	public static void splitFile(File f) throws IOException {
		FileInputStream fis = new FileInputStream(f);
		//		源是一个  目的是三个
//		定义一个缓冲区  //
		byte[] b = new byte[1024*1024];
//		创建目的
		FileOutputStream fos = null;
		int len = 0;
		int count = 1;
		File dir = new File("D:\\DemoDir");
		if(!dir.exists())
			dir.mkdir();
		while((len=fis.read(b))!=-1) {
			fos = new FileOutputStream(new File(dir,(count++)+".jpg"));
			fos.write(b,0,len);
			fos.close();
		}
	}

}
