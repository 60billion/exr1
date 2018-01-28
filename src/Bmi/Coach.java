package Bmi;

public class Coach {
	
	String level;
	public Coach(String level){
		this.level=level;
	}
	
	public String getComment(){
		String comsg = "Wrong level.";
		if (this.level == "Over Obese"){
			comsg = "You have to stick to diet and exercise a lot!";
		}else if (this.level == "Obese"){
			comsg = "You need to get in shape.";
		}else if (this.level == "Over Weight"){
			comsg = "exercise a lot.";
		}else if (this.level == "Normal Weight"){
			comsg = "How do you keep in shape?";
		}else if (this.level == "Under Weight"){
			comsg = "Can't wait to eat!";
		}
		
		return comsg;
		
	}
}
