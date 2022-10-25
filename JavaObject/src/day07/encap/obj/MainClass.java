package day07.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		
		Hotel hotel = new Hotel();
		
		//hotel.setChef(new Chef()); //1.
		
		Chef chef = new Chef(); //2.
		hotel.setChef(chef);    //2.  1.2 두개 똑같음
	
		//getter
		Chef c = hotel.getChef();
		c.cooking();
		
		System.out.println(chef == c);
	
	}
}
