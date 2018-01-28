package BmiF;


public class Main {

	public static void main(String[] args) {
		Man a = new Man(183.6,115.0);
		Man b = new Man(160.0,55.0);
		System.out.println(a.bmi());
		System.out.println(a.getLevel());
		System.out.println(a.getComment());
		
		a.bmi();
		a.getComment();
		a.getLevel();

	}

}
