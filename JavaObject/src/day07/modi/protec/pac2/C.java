package day07.modi.protec.pac2;

import day07.modi.protec.pac1.A;

public class C extends A { //protected는 상속이 된다.

	public C() {
		//A a = new A(); // 패키지가 달라서 사용이 안되는 상황
		//a.s= "홍길동";
		//a.method();
		
		//protected는 패키지가 달라도 super키워드를 통한 접근은 가능하다
		super();
		super.s = "홍길동";
		super.method();
		
	}
}
