import java.util.Arrays;

public class ArraysMain1 {

	public static void main(String[] args) {
		

	//문자열 배열 생성
	String[] country = {"korea", "japan", "usa", "china", "spain"};
		
	//이분검색 수행
	int result = Arrays.binarySearch(country, "usa");
	System.out.println(result); // sort 하지않아서 이상한 결과값이 출력됨
	System.out.println(Arrays.toString(country)); //정렬 전출력
	
	// 데이터 정렬
	Arrays.sort(country);
	// 정렬한 데이터 확인
	System.out.println(Arrays.toString(country)); // 정렬 후 출력
	
	result = Arrays.binarySearch(country, "usa");
	if(result>=0) {
		System.out.printf("%s는 %d번째 존재\n", "usa",result+1);
	}else {
		System.out.printf("%s는 존재하지 않음 \n","usa");
	}
	
	
	
	}
}
