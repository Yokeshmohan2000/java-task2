class pet{
         void brag(){
            System.out.println("I have a best pet!!!");
        }
    }
    
  class dog extends pet{
          @Override
         void brag(){
             super.brag();
            System.out.println("I have a best dog");
        }
    }
    public class SuperKeyWord {
    public static void main(String args[]){
        new SuperKeyWord();
        dog obj2=new dog();
        
        obj2.brag();   
    }
    
    SuperKeyWord()
    {
        System.out.println("Default Constructor");
    }
    
}