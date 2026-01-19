class Parent{
    private static void m1(){
        System.out.println("Parent");
    }
}


    class Child extends Parent{
        public static int m1(){
    System.out.println("Child");
return 10;
        }
    }
class Example11{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();
        
    }
}
// cte:m1() has private access in Parent