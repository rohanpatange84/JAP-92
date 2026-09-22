class A{
    void f1(){
        System.out.println("Class A");
    }
}

class B extends A{
    void f1(){
        System.out.println("Class B");
    }
}
public class Main{
    public static void main(String args[]){
        A a1 = new B();
            a1.f1();
    }
}