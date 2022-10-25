package day06.super_;

public class MainClass {

	public static void main(String[] args) {
		
		Mother m = new Mother();
		System.out.println(m.info());
		
		///
		
		Employee e = new Employee("이순신", 20, "역사");
		System.err.println(e.info());
		
		
		/*	
		Student s = new Student();
		s.age = 20 ;
		s.name = "홍길자";
		s.studentId = "123123";
		System.out.println(s.info());
	
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "이순신";
		t.subject = "역사";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.age = 40;
		e.name= "아무개";
		e.department = "인사팀";
		System.out.println(e.info());
	*/
	}
}
