package day08.poly.basic;

public class Child extends Parent {

	
	//무엇을 오버라이딩 할지 모를때
	//alt+shift+s (override method)
	
	
	@Override
	public void method02() {
		System.out.println("오버라이드 된 2번 메서드");
		//super.method02(); //부모 호출
		
	}
		public void method03() {
			System.out.println("자식의 3번 메서드");
		}
}
