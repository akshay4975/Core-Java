 abstract class Parent{
    public abstract void m1();
    public abstract void  m2();
}
abstract class ChildA extends Parent{

}
class ChildB extends Parent{
    public void m1(){
        System.out.println("M1 impl by childB");
    }
    public void m2(){
        System.out.println("m2 impl by childB");

    }
}
class GrandChildA extends ChildA{
    public void m1(){
        System.out.println("m1 impl by grandchildA");

    }
    public void m2(){
        System.out.println("m2 impl by grandchildA");

    }
} 
class GrandChildB extends ChildB{}



class Example3{
    public static void main(String[] args) {
        GrandChildA obj=new GrandChildA();
        obj.m1();
        obj.m2();

        GrandChildB obj2=new GrandChildB();
        obj2.m1();
        obj2.m2();
    }

}