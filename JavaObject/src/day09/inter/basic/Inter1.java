package day09.inter.basic;

public interface Inter1 {

	//인터페이스는 객체생성이 불가능함
	// 상수, 추상메서드 + @ ( default 메서드, static 메서드)정의가능
	
	double PI = 3.14; //인터페이스에 변수를 선언하면 상수취급된다.(public 상수로 선언됨) 
	void method01(); //인터페이스에 메서드를 선언 -> 추상메서드가 됩니다.
		
	
}
