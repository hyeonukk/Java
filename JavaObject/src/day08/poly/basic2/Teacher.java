package day08.poly.basic2;

public class Teacher extends Person {

	String subject;
	
	//생성자 
	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return super.info()+", 과목:"+ subject;
	}

}