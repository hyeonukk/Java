package pac.def;

//import pac.abc.Apple;
//import pac.abc.Banana;
import pac.abc.*;// *는  pac.abc 패키지안에 있는것 전부다 패키지로 추가됨.(패키지 다르면 import 해줘야함)

public class MainClass {

	public static void main(String[] args) {
		
		Melon m = new Melon();
		Apple a = new Apple(); //패키지가 다른 경우 ctrl+space로 클래스 확인후 import 해주기.
		Banana b = new Banana();
		
	
	
	}
}
