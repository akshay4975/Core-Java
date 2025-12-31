
class Parent{
    public void m1(){
        System.out.println("M1 from parent");
    }
     public void m2(){
        System.out.println("M2 from parent");
    }
    public void m4(){
        System.out.println("M4 from parent ");
    }
}
class Child extends Parent{
     public void m1(){
        System.out.println("M1() from child");
    } public void m2(){
        System.out.println("M1() from child");
    } public void m3(){
        System.out.println("M3() from child");
    }
}
class Example2{
    public static void main(String[] args) {
        Parent obj1=new Child();
        obj1.m1();
        obj1.m2();
        obj1.m4();
       
    }
}