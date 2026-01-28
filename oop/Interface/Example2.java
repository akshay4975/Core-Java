interface A{
    void m1();
    void m2();
}
interface B extends A{
    void m3();

}
interface C extends A{

}
class F implements C{
    public void m1(){

        System.out.println("M1 implements by class F");
    }
    public void m2(){
        System.out.println("M2 implements by class F");

    }
    public void m3(){
        System.out.println("M3 implements by class F");

    }
}
abstract class D implements B{
    public void m1(){
        System.out.println("m1 impls by class D");
    }
    public void m2(){
        System.out.println("m2 impl by class D");
    }

}
class E extends D{
    public void m3(){
        System.out.println("m3 impl by class E");
    }
}
class Example2{
    public static void main(String[] args) {
        E obj =new  E();
        obj.m1();
        obj.m2();
        obj.m3();
        F obj1 =new F();
        obj1.m1();
        obj1.m2();
        obj1.m3();
    }
}

