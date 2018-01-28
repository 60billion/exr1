package BmiF;

public class Man implements Id {
	Double tall;
	Double weight;
	Double result;
	String msg;
	
	
	public Man(Double tall, Double weight) {
		if(tall < 0 | weight<0){
			System.out.println("Invalid number.");
			return;
		}
		
		this.tall = tall;
		this.weight = weight;
	}
	
	@Override
	public Double bmi() {
		this.result = this.weight/((this.tall*this.tall)/10000);
		return this.result;
	}

	@Override
	public String getLevel() {
		this.msg = "Invalid BMI";
		if(this.result>8 && this.result<18.5){
			this.msg = "Under Weight";
		}else if(this.result>=18.5 && this.result<23){
			this.msg = "Normal Weight";
		}else if (this.result>=23 && this.result<25){
			this.msg = "Over Weight";
		}else if (this.result>=25 && this.result <30){
			this.msg = "Obese";
		}else if (this.result>=30 && this.result <40){
			this.msg = "Over Obese";
		}
		
		return this.msg;
	}

	@Override
	public String getComment() {
		String comsg = "Wrong level.";
		if (this.result>=30 && this.result <40){
			comsg = "You have to stick to diet and exercise a lot!";
		}else if (this.result>=25 && this.result <30){
			comsg = "You need to get in shape.";
		}else if (this.result>=23 && this.result<25){
			comsg = "exercise a lot.";
		}else if (this.result>=18.5 && this.result<23){
			comsg = "How do you keep in shape?";
		}else if (this.result>8 && this.result<18.5){
			comsg = "Can't wait to eat!";
		}
		
		return comsg;
	}

}
