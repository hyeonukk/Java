package day06.this_;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person(); // 부모님
		System.out.println(p.info());
		
		Person p2 = new Person("honggildong",20);
		System.out.println(p2.info());
		
		Teacher teacher = new Teacher("이순신",20,"프로그램");
		System.out.println(teacher.info());
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
