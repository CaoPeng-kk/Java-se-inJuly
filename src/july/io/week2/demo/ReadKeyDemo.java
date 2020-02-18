package july.io.week2.demo;

import java.io.IOException;
import java.io.InputStream;

public class ReadKeyDemo {

	private static Object String;

	public static void main(String[] args) throws IOException {
		String temp = null;
		readKey();
	}

//	@SuppressWarnings("unused")
	public static void readKey() throws IOException {
//		����������ݱ�ɴ�д��ӡ�ڿ���̨��     ����������over  �����¼�����
//		1.��Ϊ����¼��ֻ��һ���ֽ� Ҫ�ж��Ƿ�Ϊover ��Ҫ����ȡ���ֽ�ƴ���ַ���  -Stringbuilder
//		2.���û��س�֮ǰ�ж��Ƿ�Ϊover ������� ��ɴ�д���
		
		StringBuilder sb = new StringBuilder();
		InputStream in = System.in;
		
		int ch = 0 ;
		while((ch=in.read())!=-1) {
			if(ch=='\r')
				continue ;
			if(ch=='\n') {
				String temp = sb.toString();
				if("over".equals(temp))
					break ;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());			
			}
			else
				sb.append((char)ch);
		}	
	}
}

