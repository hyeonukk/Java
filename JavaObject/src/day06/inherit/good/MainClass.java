package day06.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Person P = new Person(); // 부모님
		P.age = 10 ;
		P.name = "부모님" ;
		System.out.println(P.info());
		
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
	}
}
