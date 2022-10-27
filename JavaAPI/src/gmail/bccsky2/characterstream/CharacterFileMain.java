package gmail.bccsky2.characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.PrintWriter;

public class CharacterFileMain {

	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("ch.txt", true));
			//문자열을 기록
			//문자열을 기록할 때 , 나 공백 및 탭 등으로 구분이 가능한데, 이런방식을 csv텍스트 방식이라 한다.
			// 이방식은 변하지 않는 고정된 데이터를 기록할때 주로 이용한다
			pw.print("adam, 사이버가수\n");
			pw.print("강진축구, 온라인축구\n");
			pw.print("프리스톤테일,MMORPG\n");
			
			//버퍼의 내용 전부 출력
			pw.flush();
		
		
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	try {
			//문자 데이터를 줄 단위로 읽을 수 있는 인스턴스 생성
		BufferedReader br = new BufferedReader(new FileReader("./ch.txt"));
		//줄 단위로 읽어서 출력하기
		while(true) {
			//한줄 읽기
			String line = br.readLine(); 
			//읽은 데이터가 없으면 종료
			if(line == null) {
				break;
			}
			//읽은 데이터 출력
			//System.out.println(line);
			
			//읽은 문자열에서 ,를 기준으로 앞의 데이터만 출력
			String[] ar = line.split(",");
			System.out.println(ar[0]);
		}
		
		br.close();
	} catch (Exception e) {
	}
	
	}
}
