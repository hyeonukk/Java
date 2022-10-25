package day09.inter.interit;

public class MainClass {

	public static void main(String[] args) {
		
	//MyClass me = new MyClass() ; //MyClass객체 생성하면 안에 들어있는 메서드 다 사용가능
	//Inter3 me1 = new MyClass();  // Myclass랑 inter3이랑 똑같음
	// Inter2 me = new MyClass(); // inter2 메서드만 사용가능
	// inter2의 default 메서드는 오버라이딩 해주지 않아도 결과값에 자동으로 출력됨
	Inter2 m2 = new MyClass();
	m2.some03();
	m2.some04();
	
	Inter1 m1 = new MyClass();
	m1.some01();
	m1.some02();
	
	
	
	}
}
