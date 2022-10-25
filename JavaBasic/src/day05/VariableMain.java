package day05;

public class VariableMain {

	public static void main(String[] args) {
	
	Variable var = new Variable() ; // 생성
	
	var.printNum(100);  // void printNum(int c)값
	
	var.a = "바꿈!";	
	var.printNum(1000);
	}
}
