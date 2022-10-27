package gmail.bccsky2.fileimformation;

import java.io.File;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//파일에 대한 정보 확인
	
		try {
			//파일 객체 생성 
			//Windows에서는 디렉토리 구분 기호가 \인데 프로그래밍 언어에서는 \가 오고 하나의 문자가 오면 제어문자로 인식한다.
			// 그래서 \를 사용하고 싶을 때는 \\(2번) 해줘야함
			File file  = new File("C:\\Users\\user\\Desktop\\Course\\자바교안 ");
			
			//파일의 존재 여부 확인
			System.out.println(file.exists());
			//마지막 수정날짜
			System.out.println(new Date(file.lastModified()));
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
