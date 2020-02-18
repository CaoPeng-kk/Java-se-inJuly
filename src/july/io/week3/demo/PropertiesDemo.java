package july.io.week3.demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
//		���� ������һ������ �������д�������5��ʱ����ʾ��ע�ᣬ���������г���
	
	public static void main(String[] args) throws IOException {
		
			myDemo();
			
		}
	

	public static void myDemo() throws IOException {
//		����Ϊproperties  ����Ҫ��ȡ�����ļ���Ϣ  �����ļ���Ҫ����һ�������� ��¼�������еĴ���
//		
//		���ж�  �������ļ���times�Ĵ���  ���==5 ��������
			
		File f = new File("demo.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		
//		���������д�������
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		String value = pr.getProperty("times");
		int count = 0 ;
		if(value!=null) {
			count = Integer.parseInt(value);
			if(count>=5) {
				throw new RuntimeException("��ע��");
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








