public class App{
	public static void main(String[] args) {
		Time t1=new Time();
		Time t2=new Time(7,40,30);

		System.out.println("Hour:"+t1.getHour()+" Minute:"+t1.getMinute()+" Second:"+t1.getSecond());

		t1.setTime(6,30,25);

		System.out.println("Hour:"+t1.getHour()+" Minute:"+t1.getMinute()+" Second:"+t1.getSecond());

		System.out.println("Hour:"+t2.getHour()+" Minute:"+t2.getMinute()+" Second:"+t2.getSecond());
		
		t2.setHour(6);
		
		System.out.println("Hour:"+t2.getHour()+" Minute:"+t2.getMinute()+" Second:"+t2.getSecond());
		
		t2.setMinute(55);
		
		t2.setSecond(25);
		System.out.println("Hour:"+t2.getHour()+" Minute:"+t2.getMinute()+" Second:"+t2.getSecond());

	}
}