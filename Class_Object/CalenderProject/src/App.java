public class App{
	public static void main(String[] args) {
		Calender c1=new Calender(2026,8,24);

		Calender c2 =new Calender(1996,12,25);

		System.out.println("Year: "+c1.getYear());
		System.out.println("Month: "+c1.getMonth());
		System.out.println("Day: "+c1.getDay());

		c1.setCalender(2027,9,22);
		

		System.out.println("Year: "+c1.getYear());
		System.out.println("Month: "+c1.getMonth());
		System.out.println("Day: "+c1.getDay());

		c1.setYear(2028);

		System.out.println("Year: "+c1.getYear());
		System.out.println("Month: "+c1.getMonth());
		System.out.println("Day: "+c1.getDay());
		System.out.println("_______________________");
		System.out.println("Year: "+c2.getYear());
		System.out.println("Month: "+c2.getMonth());
		System.out.println("Day: "+c2.getDay());
	}
}