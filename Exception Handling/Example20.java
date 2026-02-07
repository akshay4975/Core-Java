
class NotEligibleException extends RuntimeException{
    NotEligibleException(String desc){

        super(desc);

    }
}
public class Example20 {
public static void main(String[] args) {
    System.out.println("Enter Your Age: ");
    int age= new java.util.Scanner(System.in).nextInt();
    if(age>=18){
        System.out.println("You are eligible for voting ");
    }else{
        try {
            throw new NotEligibleException("You are not eligible for voting");
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
            
        }
    }
}    
}
