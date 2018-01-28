package Bmi;

public class Level {
	Double bmi;
	public Level(Double Bmi){
		this.bmi = Bmi;
	}
	
	public String getLevel(){
		String msg = "Invalid BMI";
		if(this.bmi>8 && this.bmi<18.5){
			msg = "Under Weight";
		}else if(this.bmi>=18.5 && this.bmi<23){
			msg = "Normal Weight";
		}else if (this.bmi>=23 && this.bmi<25){
			msg = "Over Weight";
		}else if (this.bmi>=25 && this.bmi <30){
			msg = "Obese";
		}else if (this.bmi>=30 && this.bmi <40){
			msg = "Over Obese";
		}
		
		return msg;
		
	}
	
	
}
