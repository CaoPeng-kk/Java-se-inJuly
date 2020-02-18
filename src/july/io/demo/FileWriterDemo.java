package july.io.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*   将c盘文本文件复制到d盘
 *  javaworkspace >- C
 * 
 * 
 * */

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
//	1. 读取源文件  将文件存到缓冲区中	
		FileReader re = new FileReader("File.txt");
		FileWriter wr = new FileWriter("D:/HomeWork/haha.txt");
		char[] ch = new char[1024];
//		int len = 0;
//		while((len =re.read(ch))!=-1) {
//		}
        re.read(ch);
        re.close();
        System.out.println(new String(ch));
//  2.	将缓冲区文件写入到指定目的地
        wr.write(ch);
        wr.flush();
        wr.close();
//		反复读取
//		关闭流
	}
		
	
	
}
