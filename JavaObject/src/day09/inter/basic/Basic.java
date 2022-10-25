package day09.inter.basic;

//인터페이스는 implements키워드로 상속을 받습니다.
public class Basic /* extends object*/ implements Inter1, Inter2 {

	@Override //추상메서드가 아닐때 오버라이딩이 꼭 들어가줘야함.
	public void method01() {
		System.out.println("오버라이딩 된 inter1번 메서드");
	}

	@Override
	public void method02() {
		System.out.println("오버라이딩 된 inter2번 메서드");
	}
}
