package Bmi;

public class Main {

	public static void main(String[] args) {
		
		BmiCa man = new BmiCa(183.6, 115.0);
		
		BmiCa woman = new BmiCa(160.0,60.0);
		
		Level chl = new Level(man.bmi());
		System.out.println(chl.getLevel());
		
		if (chl.getLevel().equals("Over Obese")){
			System.out.println("You have to stick to diet and exercise a lot!");
		}else if (chl.getLevel().equals("Obese")){
			System.out.println("You need to get in shape.");
		}else if (chl.getLevel().equals("Over Weight")){
			System.out.println("exercise a lot.");
		}else if (chl.getLevel().equals("Normal Weight")){
			System.out.println("How do you keep in shape?");
		}else if (chl.getLevel().equals("Under Weight")){
			System.out.println("Can't wait to eat!");
		}
		
		Level chl2 = new Level(woman.bmi());
		System.out.println(chl2.getLevel());
		
		if (chl2.getLevel().equals("Over Obese")){
			System.out.println("You have to stick to diet and exercise a lot!");
		}else if (chl2.getLevel().equals("Obese")){
			System.out.println("You need to get in shape.");
		}else if (chl2.getLevel().equals("Over Weight")){
			System.out.println("exercise a lot.");
		}else if (chl2.getLevel().equals("Normal Weight")){
			System.out.println("How do you keep in shape?");
		}else if (chl2.getLevel().equals("Under Weight")){
			System.out.println("Can't wait to eat!");
		}
		
	}

}
