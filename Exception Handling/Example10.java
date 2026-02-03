public class Example10 {
    public static void main(String[] args) {
        System.out.println("main() starts");
        try{
            System.out.println("try");
            System.out.println(10/0);
            System.out.println(args[1]);

        }
        catch(ArithmeticException e){
            System.out.println("arithemtic exception handled");
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("AIOOBE");
        }
        System.out.println("ends");
    }
}
