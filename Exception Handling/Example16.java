// methods of throwable

       
 class Example16{

    public static void main(String[] args) {
        
        try{
            System.out.println("try");
            System.out.println(10/0);

        }
        catch(ArithmeticException e){

            System.out.println(e);//it returns exception class name : description
            System.out.println(e.getMessage());//it returns only description
           

        }
    }
}
