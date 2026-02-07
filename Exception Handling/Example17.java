import java.util.Scanner;

class AgeNotValidException extends RuntimeException{
    AgeNotValidException(String desc){

        super(desc);

    }
    @Override
    public String toString(){
        return "you are not eligible for voting";
    }
}



public class Example17 {
    
    public static void main(String[] args) {
        System.out.println("Enter Your Age: ");
        int age=new Scanner(System.in).nextInt();
        if(age>=18){
            System.out.println("you are eligible for voting");
        }
        else{
            try{
                throw new AgeNotValidException(age+" ");
            }
            catch(AgeNotValidException e){
                System.out.println(e);
                System.out.println(e.getMessage());
                
            }
        }
    }
}
