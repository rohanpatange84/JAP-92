import java.io.Serializable;

class Student implements Serializable{
	int rollno;
	String name;
	int mark;

	

	public Student(){
		rollno=-1;
		name="";
		mark=0;
	}

 // byte stream
	public Student(int rollno, String name, int mark){
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
	}

	
	//getter
	public int getRollno(){return rollno;}
	public String getName(){return name;}
	public int getMark(){return mark;}
	

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


	@Override
	public String toString(){
		return "rollno: "+rollno+"  name: "+name+"  mark: "+mark;

	}

	

}
