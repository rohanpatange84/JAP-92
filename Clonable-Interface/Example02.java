class Address implements Cloneable{
	String landmark;
	String city;
	int pincode;

	public Address(String landmark, String city, int pincode){
		this.landmark=landmark;
		this.city=city;
		this.pincode=pincode;
	}

	public Address(){};

	//getter
	public String getLandmark(){return landmark;}
	public String getCity(){return city;}
	public int getPincode(){ return pincode;}


	//setter
	public void setLandmark(String landmark){
		this.landmark=landmark;
	}

	public void setCity(String city){
		this.city=city;
	}

	public void setPincode(int pincode){
		this.pincode=pincode;
	}


	@Override
	public String toString(){
		return "landmark: "+landmark+"   city: "+city+"   pincode: "+pincode;
	}	

	@Override
	public Address clone()throws CloneNotSupportedException{
		return (Address)super.clone();
	}


}


class Student implements Cloneable{
	int rollno;
	String name;
	int mark;

	Address address;

	public Student(){
		rollno=-1;
		name="";
		mark=0;
	}


	public Student(int rollno, String name, int mark){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	}

	public Student(int rollno, String name, int mark, Address address){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
		this.address=address;
	}
	//getter
	public int getRollno(){return rollno;}
	public String getName(){return name;}
	public int getMark(){return mark;}
	public Address getAddress(){return address;}

	//setter

	public void setRollno(int rollno){
		this.rollno=rollno;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setMark(int mark){
		this.mark=mark;
	}

	public void setAddress(Address address){
		this.address=address;
	}

	@Override
	public String toString(){
		return "rollno: "+rollno+"  name: "+name+"  mark: "+mark;

	}

	@Override
	public Student clone()throws CloneNotSupportedException{
		Student clone=(Student)super.clone();
		clone.address =(Address)address.clone();

		return clone;
	}


}


public class Example02{
	public static void main(String[] args) {

		Student s1 = new Student(45,"Suraj Thite",70);
		Address a1 = new Address("FC ROAD","PUNE",431513);

		s1.setAddress(a1);

		Student s2=null;
		try{
			s2 = s1.clone();
		}catch(CloneNotSupportedException e){

		}


		System.out.println(s1.toString());
		System.out.println(s1.getAddress());
		System.out.println("---------------------");
		System.out.println(s2.toString());
		System.out.println(s2.getAddress());

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.getAddress().hashCode());
		System.out.println(s2.getAddress().hashCode());

		


		
		

	}
}