package gmail.bccsky2.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜로 문자열 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-h-mm-ss");
			
			
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("./"+ sdf.format(date)+".txt", true);
			//기록할 메시지 생성
			String msg = "파일에 덮어쓰기";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			
			try {
				FileInputStream fis = new FileInputStream(".2022-10-27-11-45-34.txt");
				
				byte [] b = new byte[fis.available()];
				
				fis.read(b);
				
				System.out.println(new String(b));
				} catch (Exception e2) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}
