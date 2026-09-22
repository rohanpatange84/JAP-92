class Grain {

        Grain process(){
                return new Grain();
        }

        @Override
        public String toString(){
                return "Grain :: processed";
        }
}


class  Wheat extends Grain{
        Grain process(){
                return new Grain();
        }

        @Override
        public String toString(){
                return "Grain :: processed wheat";
        }
}
public class App2 {
        public static void main(String[] args) {

                Wheat w1 = new Wheat();

                System.out.println(w1.process());

     

        }
}