// aggregation example
//beacuse obj for librarian class is created outside the library class and librarrian class is not dependent on library..
class Librarian{
    String name;
    String empId;
    long contact;
    String address;

    Librarian(String name,String empId,long contact,String address){
        this.name=name;
        this.empId=empId;
        this.contact=contact;
        this.address=address;
    }

    public void displayLibrarian(){
        System.out.println("Name of Librarian:"+name);
        System.out.println("Emp id of Librarian:"+empId);
        System.out.println("Contact Number of Librarian:"+contact);
        System.out.println("Address of Librarian:"+address);

    }

}
class Library{
    String name;
    String address;
    long contact;
    int pincode;
    Librarian librarian;


    Library(String name,String address,long contact,int pincode,Librarian librarian){
        this.name=name;
        this.address=address;
        this.contact=contact;
        this.pincode=pincode;
        this.librarian=librarian;
    }

    public void displayLibrary(){
        System.out.println("Name of Library:"+name);
        System.out.println("address of Library:"+address);
        System.out.println("conact number Library:"+contact);
        System.out.println("Pincode of Library:"+pincode);

        System.out.println("Librarian Details :");
        librarian.displayLibrarian();

    }
}
class Example1{
    public static void main(String[] args) {
        Librarian librarian=new Librarian("Mahesh kumar", "abc123", 4393224321L, "deccan pune");
        Library library=new Library("Sarathi abhyasika", "Near Polyhub Food Court,VADGAON BK Pune", 1234567890L, 411046, librarian);
        library.displayLibrary();
    }
}