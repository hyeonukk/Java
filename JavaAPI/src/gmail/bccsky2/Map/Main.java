package gmail.bccsky2.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//HashMap 생성
		HashMap <String, Object> map = new HashMap<>();

		//Map에 데이터 저장 - put
		map.put("num", 1);
		map.put("name", "아담");
		map.put("job", "singer");
		map.put("job", "Cyber singer");
		
		//동일한 key에 데이터를 저장하면 이전데이터가 삭제되고 수정됨.

		//전체 데이터 확인
		System.out.println(map);

		//map에서 데이터 가져오기
		System.out.println(map.get("name"));
		System.out.println(map.get("age")); //존재하지 않는 데이터는 null값이 나옴

		System.out.println("---------------");
		//map을 이용하면 key의 이름을 몰라도 모든 데이터에 접근하는 것이 가능

		//모든 key에 접근할 수 있는 set 가져오기
		Set<String> keys = map.keySet();
		//set을 순회
		for(String key : keys) {
			//key를 순회하면서 key에 저장된 value 확인
			System.out.print(key + ": "+ map.get(key));
		}
	}

}
