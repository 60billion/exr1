package Bmi;

public class BmiCa {
	Double tall;
	Double weight;
	
	public BmiCa(Double tall, Double weight) {
		if(tall < 0 | weight<0){
			System.out.println("키 혹은 몸무게를 잘못 입력했습니다.");
			return;
		}
		
		this.tall = tall;
		this.weight = weight;
	}
	
	public Double bmi(){
		
		Double result = this.weight/((this.tall*this.tall)/10000);
		
		return result;
	}
}
