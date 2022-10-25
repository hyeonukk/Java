package day07.modi.member.pac1;

public class A {
	
	//멤버변수
	public int var1;
	int var2;
	private int var3;
	
	//메서드
	public void method1() {}
	void method2() {}
	private void method3() {}

	//생성자
	public A() {
		this.var1= 1;
		this.var2 =2;
		this.var3 =3; // private이지만 ok
		
		this.method1();
		this.method2();
		this.method3();
	}


}
