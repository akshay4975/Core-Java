class Example{
    public void m1(){
        System.out.println("M1 from class");
    }
}
interface InterFaceA{
    void m2();
}
class Example5 extends Example implements InterFaceA{
    @Override
    public void m2(){
    System.out.println("m2 from interfaceA");
}
    public static void main(String[] args) {
        Example5 obj=new Example5();
        obj.m1();

    }
}