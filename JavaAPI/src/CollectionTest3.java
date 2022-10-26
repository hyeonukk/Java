import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {

	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList 생성저장할 변수설정
		ArrayList <String> ai = new ArrayList<>();
		
		//샘플 데이터 추가
		ai.add("one");
		ai.add("Three");
		//시작시간 
		long start = System.currentTimeMillis();
		for(int i =0; i<100000; i++) {
			ai.add(1, "Two"); //첫번쨰 자리에 two 추가
		}
		//1970년 1월 1일 자정부터 지나온 시간을 밀리초 단위의 정수로 가져오기
		long end = System.currentTimeMillis();
		// 걸린시간 확인
		System.out.println(end - start);
		
		System.out.println("---------------------------");
		LinkedList <String> li = new LinkedList<>();
		
		li.add("one");
		li.add("Three");
		
		start = System.currentTimeMillis();
		for(int i =0; i<100000; i++) {
			li.add(1, "Two");
		}
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}
