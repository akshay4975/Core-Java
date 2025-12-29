// composition example because engine class is fully dependent on car class ,engine class object is created inside car class and having a strong has a relationship
class Engine{
    String name;
    String type;
    String model;
    int mYear;
    
    Engine(String name,String type,String model,int mYear){
        this.name=name;
        this.type=type;
        this.model=model;
        this.mYear=mYear;
    }
    public void displayEngine(){
        System.out.println("ENgine Name:"+name);
        System.out.println("ENgine type:"+type);
        System.out.println("ENgine model:"+model);
        System.out.println("ENgine Manu year:"+mYear);

    }
}
    class Car{
    String name;
    String color;
    int bYear;
    double price;

    private Engine engine=new Engine("Hypersion Turbo", "Petrol Engine", "Turbo Model", 2024);

    Car(String name,String color,int bYear,double price){
        this.name=name;
        this.color=color;
        this.price=price;
        this.bYear=bYear;
    }
    public void displayCar(){
        System.out.println("Cars Name:"+name);
        System.out.println("color of class:"+color);
        System.out.println("Buying year of class"+bYear);
        System.out.println("Cars price:"+price+"lakhs");
        System.out.println("Engine Details");
        engine.displayEngine();
   

    }



    }
  
    class Example2{
        public static void main(String[] args) {
            Car car=new Car("TATA SIERA", "Yellow", 2025, 14.15);
            car.displayCar();
            
        }
    }
