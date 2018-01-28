package Part1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		System.out.println(newfunction());
		
		testfunction();
		
		int number = 10;
		
		System.out.println(number);
		
		TestClass news = new TestClass();
		System.out.println(news.getNumber());
		System.out.println(news.getStr());
		
	}
	
	public static String newfunction(){
		String  a = "Hello World";
		return a;
	}
	
	public static void testfunction(){
		System.out.println("Hello World");
	}
	
	

}
