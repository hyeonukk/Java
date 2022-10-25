package day07.encap.obj;

public class Hotel { //사용자클래스

	//public String str; //멤버변수
	// public String str = new String("dd");
	private Chef chefff; //(chefff 멤버변수)
	// public Chef chefff; = new Chef();
	public Hotel() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 - 클래스를 받는 생성자.
	public Hotel (Chef chef) { // class도 타입이다. 
		this.chefff = chef;
	}
	 public void setChef(Chef chef) {
		 this.chefff = chef;
	 }
	 public Chef getChef() {
		 return chefff;
	 }
}
