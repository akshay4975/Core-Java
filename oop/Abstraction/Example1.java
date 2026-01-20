abstract class A{
public abstract void m1();
}
abstract class B extends A{}
class D extends B{
    public void m1(){
    System.out.println("M1 from D");
    }
}
abstract class E extends B{}
class F extends E{
    public void m1(){
        System.out.println("M1 from F");
    }
}

class C extends A{
    public void m1(){
        System.out.println("M1 from class c");
    }
}
abstract class G extends C{

}
class H extends G{
    public void m1(){
        System.out.println("m1 from H");
    }
}
class I extends G{
    public void m1(){
        System.out.println("m1 from I");
    }
}

class Example1{
    public static void main(String[] args) {
        A obj=new F();
        obj.m1();
         A obj2=new I();
         obj2.m1();
    }
}