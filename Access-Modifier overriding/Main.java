class A{
    int x=10;
    void f1(){
        System.out.println("Class A");
    }
    void f2(){
        
    }
}

class B extends A{
    int y=20;
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