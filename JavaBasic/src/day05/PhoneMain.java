package day05;

public class PhoneMain {

	public static void main(String[] args) {
		//객체 1
		Phone red = new Phone();
		red.info();
		
		//객체 2
		Phone blue = new Phone("가로본능");
		blue.info();
		//객체 3
		Phone black = new Phone("세로본능", 3000);
		black.info();
		//객체 4
		Phone white = new Phone(4000, "큐리텔");
		white.info();
		// 모든 멤버변수를 매개변수로 받는 생성자를 만들고
		// 초록, 10000, 아이폰 을 전달해서 객체생성
		
		Phone green = new Phone("아이폰",10000,"그린");
		green.info();
		System.out.println("----------------------");
		
		
		Test wear = new Test();
		wear.info();
		
		Test wear1 =new Test("반팔",20000,"블루");
		wear1.info();
		
		Test test1 = new Test();
		test1.clothes = "바지";
		test1.color = "화이트";
		test1.price = 10000;
		 
		Tv tv = new Tv();
		tv.power();
		tv.changeCh(10);
		tv.power();
	
	}
}
