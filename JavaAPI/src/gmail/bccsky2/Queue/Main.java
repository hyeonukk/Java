package gmail.bccsky2.Queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import gmail.bccsky2.stack.PersonVO;

public class Main {

	public static void main(String[] args) {
		
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		
		//데이터 저장
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);
		
		//데이터 꺼내기
	
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());

		//PeosonVo클래스를 저장하는 우선순위 큐
		//이상태에서 만들면 PersonVo의 크기 비교를 할 수 없기 때문에 예외 발생
		//PriorityQueue<PersonVO> persons = new PriorityQueue<>();
		
		//1. java에서는 PersonVO 클래스에 Comparable 인터페이스를 implements하고 
		//comparTo 라는 메서드를 재정의해서 해결할 수 있고
		
		//2. Comparator 인터페이스를 대입받을 수 있는 경우에는 Comparator 인터페이스를
		// 구현한 클래스의 인스턴스를 이용해서 생성해도 됩니다.
		PriorityQueue<PersonVO> persons = new PriorityQueue<> (new Comparator<PersonVO>() {

			@Override
			public int compare(PersonVO o1, PersonVO o2) {
				// TODO Auto-generated method stub
				return o2.getBirthday().compareTo(o1.getBirthday());
			}
			
		});
		
			
			
		
		persons.offer(new PersonVO(1,"강진축구",new Date(100, 9, 10),"01011112222"));
		persons.offer(new PersonVO(2,"프리스톤테일",new Date(102, 5, 1),"01033334444"));
		persons.offer(new PersonVO(3,"아담",new Date(97,1,3),"01033334444"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
	
	}
}
