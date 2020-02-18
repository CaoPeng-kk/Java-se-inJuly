package july.io.week3.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("file.txt");
		File m = new File("D:\\Java WorkSpace\\");
//		System.out.println();
//		boolean b = f.createNewFile();
//		Boolean a = f.renameTo(g);
//			System.out.println(b);
		File[] files = f.listRoots();
		for(File s :files) {
			System.out.println(s);
			
		}
		String[] names = m.list();
		for(String a : names) {
			System.out.println(a);
			
		}
		
		
	}

}
