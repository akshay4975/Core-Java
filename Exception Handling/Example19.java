import java.util.*;
class InvalidPinException extends RuntimeException{
    InvalidPinException(String desc){
        super(desc);
    }
}
class Credential{
    String name ;
     int pin;
    long contact;

    Credential(String name,int pin,long contact){
        this.name=name;
        this.pin=pin;
        this.contact=contact;
    }
    
    public void login(){
        System.out.println("You are logged in successfully");
        System.out.println("User name:"+name);
        System.out.println("Contact Number:"+contact);
        

    }


    
}
class Example19{
    public static void main(String[] args) {
        Credential obj=new Credential("Ramesh kumar",1234, 1234567890);
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your contact Number:");
        long number=sc.nextLong();
        System.out.print("Enter Your Password:");
        int userPin=sc.nextInt();
         
            if(obj.pin==userPin && obj.contact==number){

            obj.login();
            }
            else{
                try{
                    throw new InvalidPinException("Login Unsuccessful\n please enter a valid details ");

                }
            catch(InvalidPinException e){
            System.out.println(e.getMessage());
             }
        }
}
}

