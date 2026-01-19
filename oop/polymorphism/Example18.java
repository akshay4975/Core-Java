class Parent{
    public static void m1(){
        System.out.println("Parent");
     
    }
}


    class Child extends Parent{
        public static void m1(){
    System.out.println("Child");
   

        }
    }
class Example18{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();

        
    }
}



