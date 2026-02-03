public class Example14{
    public static void main(String[] args) {
        System.out.println("main() starts");
        try{
            System.out.println(" outer try");
            
            try{
            System.out.println(10/0);

            }
        
        catch(Exception e){
            System.out.println("inner catch");
            System.out.println(args[0]);
        }
    }

           
        
        catch(Throwable t){
            System.out.println("outer catch");
        }
        System.out.println("ends");
    }
}
