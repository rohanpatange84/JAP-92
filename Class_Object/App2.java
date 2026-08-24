class Person{
    String name;
    int age;
    String place;


    void information(){
        System.out.println(name);
         System.out.println(place);

    }
    int ageOfPerson(){
        return age;
    }
}

public class App2{
    public static void main(String args[]){
        Person p1=new Person();

        p1.name="Dinesh";
        p1.age=22;
        p1.place="Mumbai";

        p1.information();
       System.out.println( p1.ageOfPerson());

        
    }
}