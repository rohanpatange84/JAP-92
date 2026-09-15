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

	public void getStatus(){

		double bmi=getBMI();
		if(bmi<18.5){
			System.out.println("Underweight");
		}else if(bmi>18.5&&bmi<24.9){
			System.out.println("Normal Weight");
		}else if(bmi>25.0&&bmi<29.9){
			System.out.println("Overweight");
		}else{
			System.out.println("Obesity");
		}

	}

}




