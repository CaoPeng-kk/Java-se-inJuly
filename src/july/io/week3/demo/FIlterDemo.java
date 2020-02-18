package july.io.week3.demo;

import java.io.File;

public class FIlterDemo {
	public static void main(String[] args) {
		
		filterDemo();
		
	}

	public static void filterDemo() {
		File f = new File("D:\\");
		File[] d = f.listFiles(new FilterByName());
		for(File s : d) {
			System.out.println(s);
		}
	}
}
