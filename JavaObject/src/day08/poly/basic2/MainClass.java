package day08.poly.basic2;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//다형성을 적용한 배열
		 Student s = new Student("홍길동",20,"123123");
		 
		 Teacher t = new Teacher("홍길자", 30, "프로그램"); 
		 
		 Employee e = new Employee("홍길순", 40, "취업지원팀");
		 
		 //Object[] arr = { s,t,e };
		 Person[]arr = {s, t ,e };
		 //향상된 for문
		 for(Person p :arr) {
			 System.out.println(p.info()); //오버라이딩된 매서드
		 }
		//House 객체 생성
			House house = new House();
			house.setPerson(s); //스튜던트 저장
			house.setPerson(t); // 티쳐
			house.setPerson(e); //임플로이
			
			Person[]ar = house.getArr();
			System.out.println(Arrays.toString(ar));
			}
		//printInfo(e);
		//printInfo(s);
		//printInfo(t);
	
	//매서드
	public static void printInfo(Person p) { //부모타입 매개변수
		System.out.println(p.info());
	}
	
}

