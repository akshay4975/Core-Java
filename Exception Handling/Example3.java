class HelmetNotFoundException extends Exception{}
class AssignmentNotFoundException extends RuntimeException{}


class Example3 {
    public static void main(String[] args) {
        try{
        travelling();
        }catch(HelmetNotFoundException e){
            System.out.println("wear a helmet while riding a bike");
        }
        attendBatch(true);
    }
    public static void travelling()throws HelmetNotFoundException{
        System.out.println("start riding bike");
    }
    public static void attendBatch(boolean assignment){
        try{
            if(assignment){
                checkAssignment();
            }
        }catch(AssignmentNotFoundException ae){
            System.out.println("Assigment is not completed throw him/her out");
        }
    }
    public static void checkAssignment() {
        System.out.print(" Did you completed assignment : ");
        String resp=new java.util.Scanner(System.in).next().toUpperCase();
        if(resp.equals("YES")){
            System.out.println("attend batch ");
        }
        else{
           throw new AssignmentNotFoundException();
        }
        
    }
}
