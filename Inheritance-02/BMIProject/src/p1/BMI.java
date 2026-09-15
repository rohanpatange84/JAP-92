package p1;

public class BMI{
	private String name;
	private int age;
	private double weight;
	private double height;


	public BMI(String name,int age,double weight,double height){
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;

	}

	public BMI(String name,double weight,double height){
		this(name,0,weight,height);

	}


	public Double getBMI(){
			return weight/(height*height)*703;
	}

	public String getStatus(){

		double bmi=getBMI();
		String status;

		if(bmi<18.5){
			status="Underweight";
		}else if(bmi>18.5&&bmi<24.9){
			status="Normal Weight";
		}else if(bmi>25.0&&bmi<29.9){
			status="Overweight";
		}else{
			status="Obesity";
		}

		return status;

	}

}




