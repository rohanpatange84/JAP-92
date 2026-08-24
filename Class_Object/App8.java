class Circle{
    int radius;


    int findDimeter(){
        return radius*radius;
    }

    double areaOfCircle(){
        return 3.14*radius*radius;
    }
}

public class App8{
    public static void main(String args[]){

        Circle c1= new Circle(); 

        c1.radius=25;


       System.out.println("Area of cirlce: "+ c1.findDimeter());
       System.out.println("Area of cirlce: "+ c1.areaOfCircle());
    }
}