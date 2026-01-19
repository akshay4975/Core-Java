class Parent{
    public static int m1(){
        System.out.println("Parent");
        return 10;
    }
}


    class Child extends Parent{
        public static byte m1(){
    System.out.println("Child");
    return 11;

        }
    }
class Example15{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();

        
    }
}





//cte: return type byte is not compatible with int
