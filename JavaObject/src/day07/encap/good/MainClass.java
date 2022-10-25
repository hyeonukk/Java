package day07.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		me.setYear(2022);
		int year = me.getYear();
		System.out.println("년도:"+ year);
		
		
		me.setMonth(10);
		int month = me.getMonth();
				System.out.println("월:"+ month);
				
		me.setDay(15);
		int day = me.getDay();
		System.out.println("일:"+day);
	
		me.setSsn("909090 1615321");
		String ssn = me.getSsn();
		System.out.println("주민번호 : "+ ssn);
		
		System.out.println(year+"년"+month+"월"+day+"일");
	}
}
