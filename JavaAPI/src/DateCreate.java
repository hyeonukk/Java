import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {

	public static void main(String[] args) {
		
		//현재 시간을 갖는 java.util.date 인스턴스 생성
		Date currentTime = new Date();// date는 util,sql 두개 생성가능
		//출력 - 년월일 시분초 출력
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성 : 1977년 7월 7일 17시 :00:00
		Date firstmeetingTime = new Date(77, 6, 7, 17, 0, 0);// date는 util,sql 두개 생성가능
		//출력 - 년월일 시분초 출력
		System.out.println(firstmeetingTime);
		
		//년도만 추출해서 출력
		System.out.println(firstmeetingTime.getYear()+1900);
		//월만 출력
		System.out.println(firstmeetingTime.getMonth()+1);
		
		//원하는 포맷으로 출력
		//1977년 7월 7일 ?요일 이라고 출력
		SimpleDateFormat asd = new SimpleDateFormat("yyyy년 M월 d일 E요일") ;
		System.out.println(asd.format(firstmeetingTime));
		
		//년월일을 비교해서 년월일이 같으면 시간 과 분을 그렇지 않으면 년월일을 출력
		Date SecondmeetingTime = new Date(77, 6, 7, 17, 0, 0);
		System.out.println(SecondmeetingTime);
		
		SimpleDateFormat qwe = new SimpleDateFormat("h시 mm분 s초");
		System.out.println(qwe.format(SecondmeetingTime));
		
		if(firstmeetingTime==SecondmeetingTime) {
			System.out.println(qwe.format(firstmeetingTime));
		}else {
			System.out.println(asd.format(SecondmeetingTime));
		}
	}
}
