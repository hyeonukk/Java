package day08.static_.var;

public class MainClass {

	public static void main(String[] args) {
		//객체생성
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println("일반변수"+ c1.a); //1
		System.out.println("정적변수"+ c1.b); //1
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일반변수"+c2.a); //1 
		System.out.println("정적변수"+c2.b); //2

		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일반변수"+c3.a); //1
		System.out.println("정적변수"+c3.b); //3
		
		//static은 객체 생성없이 바로 접근가능하다.
		Count.b++; // 4 
 //		System.out.println(Count.b); // 4
 
	}
}
