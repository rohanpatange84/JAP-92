public class Doctor extends Person{
  	private String	doctorId;
    private String specialization;
	private int salary;

	// default constructor
	public Doctor(){


	}

	//constructor
	public Doctor(String doctorId,String specialization,int salary){
		this.doctorId=doctorId;
		this.specialization=specialization;
		this.salary=salary;
	}

	//setter
	public void setDoctorId(String doctorId){
		this.doctorId=doctorId;
	}

	public void setSpecialization(String specialization){
		this.specialization=specialization;
	}

	public void setSalary(int salary){
		this.salary=salary;
	}


	//getter
	public String getDoctorId(){
		return doctorId;
	}


	public String getSpecialization(){
		return specialization;
	}

	public int getSalary(){
		return salary;
	}


	//methods
	public void displayDoctor(){
		System.out.println("Doctor Id: "+doctorId);
		System.out.println("Specialization: "+specialization);
		System.out.println("Salary: "+salary);

	}



}