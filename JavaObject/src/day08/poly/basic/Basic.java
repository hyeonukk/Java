package day08.poly.basic;

//하나의 클래스파일에 여러 클래스 선언이 가능합니다.
// 단, 파이렴ㅇ과 동일한 클래스가 public여야 합니다.
class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class Basic { //사용자클래스

	//다형성(클래스형변환) - 자식의 주소가 부모에 저장되는 성질.
	//멤버변수
	A a = new B();
	A a1 = new C();
	A a2 = new D();
	A a3 = new E();
	
	//다형성은 상속을 전제로한다.
	//B b = new C();  --(X)
	//Object형에는 모든 클래스를 저장할 수 있습니다.
	Object obj =1 ;
	Object obj1 =3.14 ;
	Object obj2 ="문자열" ;
	Object obj3 = new A();
	
	
	
}
