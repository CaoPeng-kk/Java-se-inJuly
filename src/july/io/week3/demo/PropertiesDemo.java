package july.io.week3.demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
//		需求 ；运行一个程序 ，当运行次数超过5次时，提示请注册，并不再运行程序
	
	public static void main(String[] args) throws IOException {
		
			myDemo();
			
		}
	

	public static void myDemo() throws IOException {
//		容器为properties  ，先要读取配置文件信息  配置文件中要描述一个计数器 记录程序运行的次数
//		
//		做判断  拿配置文件中times的次数  如果==5 结束程序
			
		File f = new File("demo.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		
//		将容器与读写流相关联
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		String value = pr.getProperty("times");
		int count = 0 ;
		if(value!=null) {
			count = Integer.parseInt(value);
			if(count>=5) {
				throw new RuntimeException("请注册");
			}
		}
		count++;
		pr.setProperty("times", count+"");
		FileWriter wr = new FileWriter(f);
		pr.store(wr, "");
		fr.close();
		wr.close();
		
		
		
		
		
		
	}
}	








