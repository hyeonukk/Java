import java.util.Arrays;

public class CollectionTest2 {

	public static void main(String[] args) {
		
		String[] ar = {"List", "Set", "Map"};
		//배열의 데이터를 수정하는 것은 가능
		
		ar[2] = "HashTable";
		System.out.println(Arrays.toString(ar));
		
		//ar배열에 데이터를 추가하고싶으면 :
		//ar 배열보다 1개 더 큰 공간을 갖는 배열을 생성해야한다.
		String [] br = new String[ar.length-1];
		//ar의 내용을 복사
		for(int i = 0; i<ar.length-1; i++) {
			br[i] = ar[i];
		}
		//br의 마지막에 데이터 추가
		br[br.length-1] = "Properties";
		//br이 가리키는 곳을 ar이 가리키도록 한다.
		ar = br;
		System.out.println(Arrays.toString(ar));
		
}

}