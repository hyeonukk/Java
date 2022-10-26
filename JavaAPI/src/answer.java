import java.text.SimpleDateFormat;
import java.util.Date;

public class answer {

	public static void main(String[] args) {

	//현재 날짜 출력
		Date date = new Date();
		System.out.println(date);
		System.out.println("------------------");
	//원하는 날짜 출력
		Date makedate = new Date(94, 11,11, 11, 11, 11);
		System.out.println(makedate);
		
	//년도만 추출해서 출력
		System.out.println(makedate.getYear()+1900);
	//월만 출력
		System.out.println(makedate.getMonth());
	//원하는 포맷으로 출력
		SimpleDateFormat asd = new SimpleDateFormat("yyyy년 mm월 dd일 E요일");
		System.out.println(asd.format(makedate));
	//년 월일 비교해서 같으면 시간과 분 그렇지 않으면 년월일 출력
		Date makedate1 = new Date(94, 10, 10, 10, 10, 10);
		
		
		if(makedate == makedate1) {
			System.out.println("h시 m분");
		}else {
			System.out.println("yyyy년 mm월 dd일");
		}
		
		
		

	}
	}
