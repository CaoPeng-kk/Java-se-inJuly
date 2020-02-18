package july.io.week4.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Split_MergerFile {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\FullSizeRender(13).jpg");
//		File m = new File("D:\\DemoDir");
		splitFile(f);
		
//		mergeFile(m);
	}
		  
	public static void mergeFile(File Dir) throws IOException {
		ArrayList<FileInputStream>  a = new ArrayList<FileInputStream>();
	 	for(int x=1;x<3;x++) {
			
		} 
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
		FileOutputStream fin = new FileOutputStream(new File(dir,"info.txt"));
		Properties pro = new Properties();
		pro.setProperty("names", "pic");
		pro.setProperty("count", count+""); 
		pro.store(fin, "");
		fis.close();
		fin.close();
	}

}


 


