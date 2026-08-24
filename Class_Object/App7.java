class Mobile{
    int price;
    String specification;
    String colour;
    String company;

    int mobilePrice(){
        return price;
    }

    void mobileFeature(){
        System.out.println("The specification of mobile is: "+specification);
    }
    void mobileColour(){
        System.out.println("The colour of mobile is: "+colour );
    }

    void mobileCompany(){
        System.out.println("The Brand of mobile is: ");
    }
}

public class App7{
    public static void main(String args[]){
         Mobile m1=new Mobile();

         m1.price=18000;
         m1.specification="6bg ram 256gb rom -MediaTek Helio P70- Processor 4000mah Battery";
         m1.colour="While";
         m1.company="oppo";

         System.out.println("Price of mobile is"+m1.mobilePrice());
         m1.mobileFeature();
         m1.mobileColour();
         m1.mobileCompany();

    }
}