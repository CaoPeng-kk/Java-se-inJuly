package july.io.week4.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MergeDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\DemoDir");
		mergeFile(f);
	}
//	合并文件
	public static void mergeFile(File Dir) throws IOException {
		ArrayList<FileInputStream>  a = new ArrayList<FileInputStream>();
		for(int x=1;x<3;x++) {
			a.add(new FileInputStream(new File(Dir,".jpg")));
		} 
	}

}
