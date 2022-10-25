package day09.inter.basic3;

public class PetHouse {

	public static void helloPet(IPet pet) {
		pet.play();
	}
	
	//IPet타입을 받아서 기능을 출력하는 매서드
	//IPet[]타입을 매개변수로 받아서 배열 내부 pet들의 play를 실행
	
	public static void PetHouse(IPet[] pets){
		for(int i = 0; i<=pets.length; i++) {
			pets[i].play(); 
		}
	}
}
