import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest4 {

	public static void main(String[] args) {

		//100000개의 데이터를 가진 ArrayList 와 LinkedList 생성
		ArrayList<Integer> a1 = new ArrayList<>();
		for(int i = 0; i<100000; i++) {
			a1.add(i);
		}
		
		LinkedList<Integer> l1 = new LinkedList<>();
		for(int i = 0; i<100000; i++) {
			l1.add(i);
		}
		
		//ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드는 get(인덱스)
		//실행해서 가장 마지막에 나오는 숫자 확인 후 ai, li 비교하기
		long start = System.currentTimeMillis();
		for(int i =0; i<100000; i++) {
			System.out.println(a1.get(i));
			//System.out.println(l1.get(i));
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
