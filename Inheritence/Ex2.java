
class Art{
	{
		System.out.println("Art Instance Block");
	}

	public Art(){
		System.out.println("Art Constructor");
	}

}

class Drawing extends Art{
	{
		System.out.println("Drawing Instance Block");
	}


	public Drawing(){
		System.out.println("Drawing Constructor");
	}


}


class Pictures extends Drawing{

	{
		System.out.println("Pictures Instance Block");
	}


	public Pictures(){
		System.out.println("Pictures Constructor");
	}


}

public class Ex2{
	public static void main(String[] args) {

		Pictures p1 =new Pictures();


		
	}
}