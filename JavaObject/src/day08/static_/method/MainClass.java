package day08.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.some1(); //일반메서드
	//	c.some2(); //가능은 하지만 정적메서드는 아래방식으로 쓰는게 좋음
		Count.some2(); //static 정적메서드 사용방법
		//현재 b는? 3이다(3번호출되어서)
		
		//main은 static이기때문에
		a();
		//static사용방법
		Math.random();
		Integer.parseInt("3");
		Arrays.toString(new int[3]);
		
	}
	
	public static void a() {
		
	}
}