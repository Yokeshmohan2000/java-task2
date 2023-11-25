public class OverLoad_2 {
    
    String name;
    int age;
    OverLoad_2()
    {
        System.out.println("Hello");
    }
    
    OverLoad_2(String i){
        
        name=i;
        
    }
    
    OverLoad_2(String i,int a){
        
        name=i;
        age=a;
        
    }
    void display(){
        System.out.println("hello"+name+age);
    }
    
    
    
    public static void main(String args[]){
        OverLoad_2 obj=new OverLoad_2();
        OverLoad_2 obj1=new OverLoad_2("Hariharan");
        OverLoad_2 obj2=new OverLoad_2("Hariharan",23);
        
        obj1.display();
         obj2.display();
    }
}