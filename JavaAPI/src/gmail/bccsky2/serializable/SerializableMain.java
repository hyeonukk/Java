package gmail.bccsky2.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class SerializableMain {

	public static void main(String[] args) {
			//try() 안에 넣으면 close로 닫아주지 않아도 데이터 낭비가 안됨.
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multiobject.txt"));) {
			//인스턴스 단위로 파일에 기록할 수 있는 객체를 생성
			//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multiobject.txt"));
			//기록할 인스턴스 생성
			StudentDTO dto = new StudentDTO(1,"아담", new Date());
			StudentDTO dto1 = new StudentDTO(2,"강진축구", new Date());
			
			//기록할 인스턴스가 여러 개 이므로 하나의 List로 묶어줍니다.
			ArrayList<StudentDTO> list = new ArrayList<>();
			list.add(dto);
			list.add(dto1);
			//기록
			//oos.writeObject(dto);
			oos.writeObject(list);
			//oos.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		//try() 안에 객체 넣으면 close로 안 닫아도 된다. 
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multiobject.txt"));){
		//인스턴스 단위로 파일에 읽을 수 있는 객체를 생성
		//ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multiobject.txt"));
		//하나의 데이터 읽어오기
		//기록을 할때 List를 사용했으므로 읽어올 때 List로 읽어와야 한다.
		ArrayList list = (ArrayList)ois.readObject();
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		//기록
		
		//ois.close();
		
	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	
	}
}
