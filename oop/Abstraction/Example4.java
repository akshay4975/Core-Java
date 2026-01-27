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
class Example4 extends Example implements Demo{
    @Override
        public void m1(){
            super.m1();
       Demo.super.m1();

        System.out.println("m1 from interface overrided by Driver Ex");
    }
    public static void main(String[] args) {
        Example4 obj=new Example4();
        obj.m1(); 
       
    }
    }
