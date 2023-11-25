class  Parent{
        public static void  parentClass(){
            System.out.println("parentclass");
        }
    }



class  child extends Parent{
        public static void  parentClass()
{
 System.out.println("Childclass");      
    }
}
 
 
class  Inheritance{
public static void main(String args[]){
Inheritance obj=new Inheritance();

Parent parentobj=new Parent();  //comment this block to over the parent class
parentobj.parentClass();

child childobj=new child();
childobj.parentClass();

}
Inheritance()
    {
   System.out.println("Default Constructor");
    }
 }