package gmail.bccsky2.bytefileprocessing;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mainnn {

	public static void main(String[] args) {
		
		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-h-mm-ss");
			//파일 생성하기
			FileOutputStream fos = new FileOutputStream("./"+"123123.txt");
			
			String msg = "파일에 기록하기";
			
			
			fos.write(msg.getBytes());
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
