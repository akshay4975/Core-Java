//Hierarchical Inheritance of MEta-whatsapp,FAcebook,Instagram

class Meta{
    String userName;
    String gender;
    String password;
    int dob;

    Meta(String username,String gender,String password,int dob){
        this.userName=username;
        this.gender=gender;
        this.password=password;
        this.dob=dob;

    }
    public void displayMeta(){
        System.out.println("Enter the username :"+userName);
        System.out.println("password of the user:"+password);
        System.out.println("DOB of User:"+dob);
        System.out.println("Gender of user:"+gender);
    }

}
class Facebook extends Meta{
    String name;
    String fbPassword;
    long contact;
    String accountType;


    Facebook(String username,String gender,String password,int dob,String name,String fbPassword,long contact,String accountType){
    super(username, gender, password,dob);
    this.name=name;
    this.fbPassword=fbPassword;
    this.contact=contact;
    this.accountType=accountType;
    }
  public void displayFacebook(){
        System.out.println("Enter the name of user:"+name);
        System.out.println("password of the facebook:"+fbPassword);
        System.out.println("Contact of the user:"+contact);
        System.out.println("Account Type of user:"+accountType);
    }
}
class Instagram extends Meta{
    String instaId;
    String instaPassword;
    long contact;
    String accountType;


    Instagram(String username,String gender,String password,int dob,String instaId,String instaPassword,long contact,String accountType){
    super(username, gender, password,dob);
    this.instaId=instaId;
    this.instaPassword=instaPassword;
    this.contact=contact;
    this.accountType=accountType;
    }
  public void displayInstagram(){
        System.out.println("Enter the Insta Id of the user:"+instaId);
        System.out.println("password of the Instagram:"+instaPassword);
        System.out.println("Contact of the user:"+contact);
        System.out.println("Account Type of user:"+accountType);
    }
}
class Whatsapp extends Meta{
    String name;
    String securityCode;
    long contact;
    String accountType;


    Whatsapp(String username,String gender,String password,int dob,String name,String securityCode,long contact,String accountType){
    super(username, gender,password,dob);
    this.name=name;
    this.securityCode=securityCode;
    this.contact=contact;
    this.accountType=accountType;
    }
  public void displayWhatsapp(){
        System.out.println("Enter the name of user:"+name);
        System.out.println("Security code of the Whatsapp:"+securityCode);
        System.out.println("Contact of the user:"+contact);
        System.out.println("Account Type of user:"+accountType);
    }
}
class HierarchicalInheritance{
    public static void main(String[] args) {
        Facebook facebook=new Facebook("akshay03", "male", "abc123", 12122003,
         "Akshay Nabage", "123abc", 1234567908L, "public account");
         System.out.println("meta info");
         facebook.displayMeta();
         System.out.println("Facebook Info");
        facebook.displayFacebook();
          Instagram instagram=new Instagram("akshay03", "male", "abc123", 12122003,
         "akshaynabage03", "123abc", 1234567908L, "private account");
        System.out.println("Instagram Info");
         instagram.displayInstagram();
          Whatsapp whatsapp=new Whatsapp("akshay03", "male", "abc123", 12122003,
         "Akshay Nabage", "1212", 1234567908L, "Buisness account");
        System.out.println("Whatsapp Info");
         whatsapp.displayWhatsapp();
        
    }
}