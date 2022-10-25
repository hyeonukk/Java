package day06.super_;

public class Person extends Object { //부모클래스로 사용

	String name;
	int age;
	
	Person() {
		this("홍길동",1);
		//this.name = "홍순자" ; 
		//this.age= 1;
	}
	
	Person(String name) {
		this(name, 1);
	}
	
	Person(String name, int age) {
		super();
		this.name =name.toUpperCase();
		this.age = age;
		
		//System.out.println("100줄짜리 코드");
	}
	
	String info() {
		return "이름:"+ name +",나이:" + age ; 
	}
}
