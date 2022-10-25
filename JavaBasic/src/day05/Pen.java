package day05;

//대량생산 목적 class는 main이 존재하지 않음

public class Pen {

	//클래스에서 속성을 나타내는 것을 멤버변수(field)라고 부른다.

	String color;
	int price;
	String company;
	
	//클래스에서 기능을 나타내는 것을 메서드로 부른다.
	void write() {
		System.out.println(color+ "글씨를 씁니다.");
	}

	void info() {
		System.out.println("===펜의 정보===");
		System.out.println("색상:" + color);
		System.out.println("가격:" + price);
		System.out.println("제조사:" + company);
	}
}

