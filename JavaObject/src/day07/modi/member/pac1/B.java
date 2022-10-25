package day07.modi.member.pac1;

public class B {

	//A의기능
	
	public B() {
		A a = new A();
		a.var1 =1;
		a.var2 =2;
	
		//a.var3= 3;  private라 사용불가능
		
		a.method1();
		a.method2();
		//a.method3(); private라 사용불가능
	}
}
