public class Example11{
    public static void main(String[] args) {
        System.out.println("main() starts");
        try{
            System.out.println("try");
            System.out.println(10/0);
         

        }
        catch(ArithmeticException e){
            System.out.println("arithemtic exception handled");
            System.out.println(args[1]);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("AIOOBE");
        }
        System.out.println("ends");
    }
}
