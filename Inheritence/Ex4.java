class Art{

	static {
		System.out.println("Art static Block 01");
	}

	{
		System.out.println("Art Instance Block");
	}

	public Art(){
		System.out.println("Art Constructor");
	}
	static {
		System.out.println("Art static Block 02");
	}

}

class Drawing extends Art{

	static {
		System.out.println("Drawing static Block 01");
	}

	{
		System.out.println("Drawing Instance Block");
	}


	public Drawing(){
		System.out.println("Drawing Constructor");
	}

	static {
		System.out.println("Drawing static Block 02");
	}

}


class Pictures extends Drawing{

	static {
		System.out.println("Pictures static Block 01");
	}

	{
		System.out.println("Pictures Instance Block");
	}


	public Pictures(){
		System.out.println("Pictures Constructor");
	}

	static {
		System.out.println("Pictures static Block 02");
	}


}

public class Ex4{
	public static void main(String[] args) {
		System.out.println("Hello before creating object");

		Drawing d1;

		//only object initialize not created, so static block are not runing


		
	}
}