public class OverLoads{
    
    OverLoads(){
        System.out.println("Default Constructor");
    }
   public void m1() {
        System.out.println("Hello");
    }

    public void m1(String name) {
        System.out.println("\"Hello\", " + name);
    }

    public static void main(String[] args) {
        OverLoads_31 Obj = new OverLoads_31();

                  
        Obj.m1("hariharan");          
    }
}