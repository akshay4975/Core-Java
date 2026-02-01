class InvalidPinException extends Exception{
    InvalidPinException(String desc){
        super(desc);
    }
}

class Example2{
    static int userPin=1234;
    static double balance=30000;
    public static void main(String[] args) {
        System.out.println("Exe starts");
        System.out.println("Enter a pin:");
        int pin=new java.util.Scanner(System.in).nextInt();
        try{
            checkBalance(pin);
        }
        catch(InvalidPinException e){
            System.out.println("please enter a valid pin");
        }
    }
        public static void checkBalance(int pin)throws InvalidPinException{
            if(userPin==pin){
                System.out.println("ACCOUNT BALANCE IS:"+balance);
            }
            else{
                throw new InvalidPinException("Entered pin is invalid");
            }
            
            

        
    }
}