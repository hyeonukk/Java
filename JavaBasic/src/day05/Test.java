package day05;

public class Test {
	//멤버변수 
	String clothes;
	int price;
	String color;
	//생성자
	Test () {
		System.out.println("물건");
		clothes = "후드";
		price= 50000;
		color = "블랙";
	}
	//멤버변수 받아주는 생성자 (밑에 값을 제일위 멤버변수에 저장)
	Test(String cClothes, int cPrice, String cColor){
		clothes =cClothes;
		price = cPrice;
		color = cColor;
	}
	
	void info() {
		System.out.println("옷에 대한 정보");
		System.out.println("종류 :"+ clothes);
		System.out.println("가격 :"+ price);
		System.out.println("색깔 :"+ color);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
