package gmail.bccsky2.Set;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		
		//랜덤한 숫자 추출하기 위한 인스턴스 생성
		Random r = new Random();
		
		//ArrayList 활용
		ArrayList <Integer> a1 = new ArrayList<>();
		
		//ArrayList의 size가 6보다 작을때 까지
		while(a1.size()<6) {
			//1~45까지 랜덤하게 추출
			int su = r.nextInt(45)+1;
			//중복검사해서 통과하면 add하고 통과하지 못하면 add 수행하지 안흠
			if(a1.contains(su)) {
				continue;
			}
			a1.add(su);
		}
		//출력 전 정렬
		a1.sort(null);
		//출력
		System.out.println(a1);
		
		//TreeSet : 중복된 데이터를 저장하지 않고 저장된 순서를 기억합니다.
		TreeSet<Integer> treeset = new TreeSet<>();
		while(treeset.size()<6) {
			int su = r.nextInt(45)+1;
			treeset.add(su);
		}
	for(Integer i : treeset) {
		System.out.print(i+"  ");
	}
	}
}
