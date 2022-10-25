package day09.abs.good;

public abstract class Store {
	/*
	 * 1. 메서드에 abstract를 붙이면 추상메서드가 됩니다.({}가 없는 메서드)
	 *   abstract 추상메서드를 사용하려면 클래스에도 abstract를 적어줘야함
	 */
	 

	public abstract void apple(); // 추상메서드라고 함
	public abstract void melon();
	public abstract void orange();
	
	//추상메서드에 멤버변수, 생성자, 일반메서드 전부 사용가능하다. 
	private String name = "호식이네" ;
	//생성자
	public Store() {
		System.out.println("추상클래스 생성자 호출");
	}
	// 일반메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
