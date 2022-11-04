


	public class Student {
		
		int age;
		String name;
		int number;
		String model;
			
		public void infoo() {
			System.out.println(name + model+age);
		
		}

	
		public static void main(String[] args) {
			
			Student s = new Student();
			s.age = 10;
			s.name ="김민수"; 
			s.number = 0103333;
			s.model = "iphone";
			s.infoo();
			
			System.out.println(s);
		}
	} 
			
			
			
			