class Parent{
    public static int m1(){
        System.out.println("Parent");
        return 10;
    }
}


    class Child extends Parent{
        public static void m1(){
    System.out.println("Child");
   

        }
    }
class Example17{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();

        
    }
}
//cte:  return type void is not compatible with int




