package gmail.bccsky2.thread;

//Thread 클래스로 부터 상속 받는 클래스 생성
	class ThreadEx extends Thread{
		//public void run 이라는 오버라이딩
		@Override //어노테이션은 상위클래스 나 인터페이스에서 제공하는 메서드가 아닌경우에 에러를 발생시켜 주는 것
		public void run () {
			//스레드로 수행할 내용
			//1초마다 Thread 클래스라는 문장을 10번 출력
			for(int i =0; i<10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread 클래스");
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		}
		
	}
	class RunnableImpl implements Runnable {

		@Override
		public void run() {
			//스레드로 수행할 내용
			//1초마다 Runnable 인터페이스 라는 문장을 10번 출력
			for(int i =0; i<10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Runnable 인터페이스");
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
			
		}
		
	}
	

public class ThreadCreate {

	
	public static void main(String[] args) {
		//Thread 클래스로부터 상속받은 클래스를 이용해서 스레드를 생성하고 실행
		Thread th1 = new ThreadEx();
		//Start를 호출하면 run 메서드의 내용을 수행
		th1.start();
		
		//Runnable 인터페이스를 implements 클래스를 이용해서 스레드를 생성하고 실행
		Thread th2 = new Thread(new RunnableImpl());
		th2.start();
		//Runnable 인터페이스를 Anonymous Class를 이용해서 사용
		Thread th3 = new Thread(new Runnable() {
			public void run() {
				for(int i =0; i<10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Anonymous 활용");
					} catch (Exception e) {
						System.out.println(e.getLocalizedMessage());
					}
				}
			}
		});
		th3.start();
		
		//Runnable 인터페이스는 public void run 메서드 1개만소유하면 ( 람다 식을 써도 된다)
		Thread th4 = new Thread(()->  {
			for(int i =0; i<10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("람다의 활용");
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		th4.start();
	}
}
