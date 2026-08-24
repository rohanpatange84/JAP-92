class Room{
    int length;
    int width;
    String colour;
    boolean tv;

    int areaOfRoom(){
        return length*width;

    }
    void colour(){
        System.out.println(colour);
    }
    boolean isTvPresent(){
        return tv;
    }
}

public class App3{
    public static void main(String args[]){
        Room r1= new Room();

        r1.length=20;
        r1.width=10;
        r1.colour="While";
        r1.tv=true;


        System.out.println("Area of room is: "+r1.areaOfRoom());
        r1.colour();
        System.out.println("Is tv present in room: "+r1.isTvPresent());


    }
}