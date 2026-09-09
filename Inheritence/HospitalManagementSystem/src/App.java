public class App{
	public static void main(String[] args) {
		Doctor d1 = new Doctor("D101","Cardiologist",50000);
		Patient p1 =new Patient("P201","Fever",206);

		d1.setName("Rohan");
		d1.setAge(23);
		d1.setPhone("7666766387");

		d1.displayPerson();
		d1.displayDoctor();

		System.out.println("---------------------");

		p1.setName("Dinesh");
		p1.setAge(22);
		p1.setPhone("8666766387");

		p1.displayPerson();
		p1.displayPatient();



		
	}
}