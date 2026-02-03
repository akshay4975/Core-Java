public class Example12{
    public static void main(String[] args) {
        System.out.println("main() starts");
        try{
            System.out.println("try");
            try{
                System.out.println("inner try");
                String str=null;
                System.out.println(str.charAt(0));
            }
            catch(ClassCastException ce){
                System.out.println("inner catch");
            }         
        }
        catch(ArithmeticException e){
            System.out.println("arithemtic exception handled");
        }
        catch(NullPointerException npe){
            System.out.println("NPE");
        }
        System.out.println("ends");
    }
}
