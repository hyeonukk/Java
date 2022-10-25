package day06.super_;


public class Employee extends Person {

	String department;
	
	//생성자
	
	Employee(String name, int age, String department) {
		super(name, age);
		//super();
		//this.name = name;
		//this.age = age;
		this.department = department;
	
	}
	
	String info() {
		// super.메서드()사용목적 - 오버라이딩된 메서드에서 부모님의 원형메서드가 필요할때 
		// 사용이 가능함
		return super.info()+ ", 부서:"+ department;
	}
}
