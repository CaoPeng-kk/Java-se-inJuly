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
//		将输入的数据变成大写打印在控制台上     如果输入的是over  则键盘录入结束
//		1.因为键盘录入只读一个字节 要判断是否为over 需要将读取的字节拼成字符串  -Stringbuilder
//		2.在用户回车之前判断是否为over 如果不是 变成大写输出
		
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

