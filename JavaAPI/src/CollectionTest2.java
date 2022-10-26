import java.util.Arrays;

public class CollectionTest2 {

	public static void main(String[] args) {
		//배열의 생성
		String[]arr = {"List", "Set", "Map"};
		//배열에 해시테이블 추가
		arr[2] = "HashTable";
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--------------------");
		//배열에 데이터 추가하려면 더 큰공간을 갖는 배열을 생성 후 삽입해야한다.
		String[] br = new String[arr.length+1];
		
		for(int i = 0; i<arr.length; i++) {
			br[i] = arr[i];
			System.out.println(Arrays.toString(br));
		}
		br[br.length-1] = "Properties";
		arr = br;
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(arr));
		
}

}
//배열에 데이터를 추가할땐 더 큰 배열을 만들어 주고 데이터를 삽입해야한다.
//배열의 교체는 가능하지만 바로 추가는 불가능하다.