class Example{
    public void m1(){
        System.out.println("M1 from class");
    }
}
interface Demo{

    default void m1(){
        System.out.println("M1 from interface");
    }
}
class Example3 extends Example implements Demo{
    @Override
        public void m1(){
            super.m1();
       Demo.super.m1();

        System.out.println("m1 from interface overrided by Driver Example");
    }
    public static void main(String[] args) {
        Example3 obj=new Example3();
        obj.m1(); 
       
    }
    }
