package gmail.bccsky2.stream;

import java.util.ArrayList;

public class LoopingMain {

	public static void main(String[] args) {
		//여러가지 방법이 있지만 다 같은결과를 출력함 
		ArrayList<String> list = new ArrayList<>();
		list.add("프로그래밍 언어");
		list.add("데이터베이스");
		list.add("프레임워크");
		list.add("소프트웨어 공학");
		list.add("Toy Project");

		//전체 데이터 출력 - 실행 속도는 가장 빠르지만 list 개수가 변경되면
		// 수정해야해서 좋지 않음
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println("----------------------");
		//반복문을 이용하면 개수를 변경하여도 수정할 필요가 없음 
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
		//같은 반복문 이지만 밑에 방법이 위에 방법보다 더 낫다.
		//변하지 않는 메서드의 호출 결과를 반복문에서 여러 번 호출하는 것은 자원의 낭비
		int len = list.size();
		for(int i = 0; i<len; i++) {
			System.out.println(list.get(i));
	}
		System.out.println("----------------------");
	//모든 데이터를 순회하는 경우라면, 빠른 열거를 이용하는 것이 효율적이다.
		for(String subject : list) {
			System.out.println(subject);
		}
		System.out.println("----------------------");
		//빠른열거는 반복자를 외부에 만들어서 사용하는데 stream api 는 내부 반복자를 사용함
		//속도는 제일빠름 
		list.stream().forEach(subject -> {
			System.out.println(subject);
		});
	
	}
}
