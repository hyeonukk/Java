package day07.encap.good;

public class MyBirth {

	private int year;
	private int month;
	private int day;
	private String ssn; 
	
	/*
	 * 은닉된 변수에 접근할 때 클래스설계자가 만들어 놓은 
	 * getter/ setter매서드를 사용합니다.
	 * 
	 * 매서드가 get(값을 얻는다.), set으로시작(값을 저장한다.)
	 * set메서드
	 * 1.값을 저장하는 메서드
	 * 2. public으로 선언하고 set + 멤버변수명으로 저장.
	 */
	//값을 저장하는 set 메서드
	public void setYear(int year ) {
		//유효값 검증
		if(year > 2022 || year <1900 ) {
			System.out.println("년도는 1900~2022년까지 입니다.");
		} else {
			System.out.println("저장완료");
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		if(month>=12 || month<=1) {
			System.out.println("달은 12월까지 입니다.");
		} else {
			this.month = month;
		} 
	}
	public void setDay(int day) {
		if(day>=31 || day<=1) {
			System.out.println("일은 31일까지 입니다.");
		} else {
			this.day = day;
		}
	}
	//매개변수는 String ssn
	public void setSsn(String ssn) {
		String result= ssn.replace("-","");
		if(result.length() > 13) {
			System.out.println("주민번호는 13자리입니다.");
		}else {
			this.ssn = ssn;
		}
	}
	

	
	/*
	 * getter메서드 - getter는 반환이 있음
	 * 1. 값을 조회하는 메서드
	 * 2. public으로 선언하고 get + 멤버변수명으로 지정.
	 * 
	 */
	//값을 조회하는 get 메서드
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public String getSsn() {
		return ssn;
		/*
	 * month, day, ssn에 대한 getter, setter생성
	 * month 1~12월 까지만 저장가능
	 * day 1~31일 까지만 저장가능
	 * ssn - 하이픈을 제거하고 13까지만 저장가능.
	 */
	
	}
}
