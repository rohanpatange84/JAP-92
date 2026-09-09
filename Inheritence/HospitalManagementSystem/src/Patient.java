public class Patient extends Person{
	private String	patientId;
	private String disease;
	private int roomNumber;

	//default constructor
	public Patient(){

	}

	//constructor
	public Patient(String patientId ,String disease,int roomNumber){
		this.patientId=patientId;
		this.disease=disease;
		this.roomNumber=roomNumber;
	}

	//setter

	public void setPatientId(String patientId){
		this.patientId=patientId;
	}

	public void setDisease(String disease){
		this.disease=disease;
	}

	public void setRoomNumber(int roomNumber){
		this.roomNumber=roomNumber;
	}

	//getter
	public String getPatientId(){
		return patientId;
	}

	public String getDisease(){
		return disease;
	}

	public int getRoomNumber(){
		return roomNumber;
	}

	//methods
	public void displayPatient(){
		System.out.println("Patient Id: "+patientId);
		System.out.println("Disease: "+disease);
		System.out.println("Room Number: "+roomNumber);
	}



}