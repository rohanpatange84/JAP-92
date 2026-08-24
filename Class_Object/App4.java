class watch{
    double time;
    int price;
    String colour;

    double sayTime(){
        return time;
    }
    int price(){
        return price;
    }
    void colour(){
        System.out.println("Colour Of watch is: "+colour);
    }
}

public class App4{
    public static void main(String args[]){
        watch w1=new watch();

        w1.time=12.52;
        w1.price=650;
        w1.colour="Brown";

        double time =w1.sayTime();
        System.out.println("The Time is: "+time);
        System.out.println("The Price of Watch is: "+w1.price);
        w1.colour();


        
    }
}