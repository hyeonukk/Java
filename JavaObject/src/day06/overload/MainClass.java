package day06.overload;

public class MainClass {

public static void main(String[] args) {
	
	Basic b = new Basic();
	
	b.input(1);
	b.input("홍길동");
	b.input(1, "홍길동");
	b.input("홍길동", 10);
	b.input(100, 100.1, 1);
	
	//인트배열, 실수배열, 문자열배열 
	//Arrays.toString()
}

}
