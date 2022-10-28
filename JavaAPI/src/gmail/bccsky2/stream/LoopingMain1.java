package gmail.bccsky2.stream;

import java.util.ArrayList;

public class LoopingMain1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("대한민국");
		list.add("미국");
		list.add("중국");
		list.add("일본");
		list.add("나라");
		
		System.out.println(list.get(0));
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		int a  = list.size();
		for(int i = 0; i<a; i++);{
			
			System.out.println(list.get(a));
		}
	}
	
}
