//functional interface
@FunctionalInterface
interface Demo{
    void m1();
}
class Example6 {
    public static void main(String[] args) {
        Demo obj=new Demo(){
            @Override
            public void m1(){
                System.out.println("m1 from Demo");
            }
        };
        
obj.m1();
    }
}