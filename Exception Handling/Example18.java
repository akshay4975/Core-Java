class Demo1{}
class Demo2 extends RuntimeException{}
class Demo3 extends Throwable{}
class Demo4 extends Error{}
class Demo5 extends Demo3{}
class Demo6 extends Object{}

public class Example18 {
    public static void main(String[] args) {
        throw new ArithmeticException();
        throw new Demo1();//cte
        throw new Demo2();
        throw new Demo3();
        throw new Demo4();
        throw new Demo5();
        throw new Demo6();//cte

    }
}
