class Candy {
    public void taste() {
        System.out.println("tastes sweet!");
    }
}
class Chocolate extends Candy {
        @Override
        public void taste() {
       super.taste();       
        System.out.println("tastes chocolately");
    }
}

public class Overide {
    public static void main(String[] args) {
      new Overide(); 


        Chocolate chocolate = new Chocolate();
        chocolate.taste();
        
       
    }
     Overide(){
        System.out.println("Default constructor");
    }
}