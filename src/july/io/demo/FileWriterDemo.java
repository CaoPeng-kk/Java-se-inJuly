package july.io.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*   ��c���ı��ļ����Ƶ�d��
 *  javaworkspace >- C
 * 
 * 
 * */

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
//	1. ��ȡԴ�ļ�  ���ļ��浽��������	
		FileReader re = new FileReader("File.txt");
		FileWriter wr = new FileWriter("D:/HomeWork/haha.txt");
		char[] ch = new char[1024];
//		int len = 0;
//		while((len =re.read(ch))!=-1) {
//		}
        re.read(ch);
        re.close();
        System.out.println(new String(ch));
//  2.	���������ļ�д�뵽ָ��Ŀ�ĵ�
        wr.write(ch);
        wr.flush();
        wr.close();
//		������ȡ
//		�ر���
	}
		
	
	
}
