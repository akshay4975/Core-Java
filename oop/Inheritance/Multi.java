//MULTI-level inheritance on topic country-state-district
class Country{
    String name;
    String primeMinister;
    String capital;
    long population;
//constructor
Country(String name,String primeMinister,String capital,long population){
    this.name=name;
    this.primeMinister=primeMinister;
    this.capital=capital;
    this.population=population;
}
  //display method
public void displayCountry(){
    System.out.println("Name Of Country:"+name);
    System.out.println("Name Of Prime Minister:"+primeMinister);
    System.out.println("Capital Of Country:"+capital);
    System.out.println("Total population Of Country:"+population);
    System.out.println("");
}

}


    class State extends Country{
    String sName;
    String cm;
    String sCapital;
    long sPopulation;
    
    State(String sName,String cm,String sCapital,long sPopulation,String name,
        String primeMinister,String capital,long population){
        super(name, primeMinister, capital, population);
        this.sName=sName;
        this.cm=cm;
        this.sCapital=sCapital;
        this.sPopulation=sPopulation;
    }
    public void displayState(){
    System.out.println("Name Of State:"+sName);
    System.out.println("Name Of chief Minister:"+cm);
    System.out.println("Capital Of State:"+sCapital);
    System.out.println("Total population Of State:"+sPopulation);
    }
}
class District extends State{
    String districtName;
    String mp;
    String districtOffice;
    long districtpopulation;
    
    District(String districtName,String mp,String districtOfiice,long districtpopulation,
         String sName,String cm,String sCapital,long sPopulation,String name,
        String primeMinister,String capital,long population){
        super(sName, cm,sCapital,sPopulation,name, primeMinister, capital, population);
        this.districtName=districtName;
        this.mp=mp;
        this.districtOffice=districtOfiice;
        this.districtpopulation=districtpopulation;
    }
    public void displayDistrict(){
    System.out.println("Name Of District:"+districtName);
    System.out.println("Name Of Member Of Parlament:"+mp);
    System.out.println("District Office:"+districtOffice);
    System.out.println("Total population Of District:"+districtpopulation);
    }
}

class Multi{
    public static void main(String[] args) {
        District district=new District("AHILYANAGAR","NILESH LANKE","NEW AHILYANAGAR", 12345l,
        "MAHARASHTRA", "AJIT PAWAR", "Mumbai", 12345622L,
         "INDIA", "RAHUL GANDHI", "DELHI", 987654321L);
         district.displayCountry();
         district.displayState();
         district.displayDistrict();
    }
}