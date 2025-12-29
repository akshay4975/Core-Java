// real-world application
class Fish{ 
String fishBreed; 
String fishType; 
double fishPrice; 
String fishColor; 
Fish(String fishBreed,String fishType,double fishPrice,String fishColor){ 
super(); 
this.fishBreed = fishBreed; 
this.fishType = fishType; 
this.fishPrice = fishPrice; 
this.fishColor = fishColor; 
} 
void displayFish(){ 
System.out.println("Fish : [breed = "+fishBreed+", Type = "+fishType 
+", Price ="+fishPrice+", Color ="+fishColor+"]"); 
} 
} 
//2 
class FishTank{ 
String material; 
String shape; 
String dimension; 
double price; 
double capacity; 
Water water; 
Stone stone; 
FishFood food; 
Plant plant; 
Light light; 
Filter filter; 
Fish fish; 
FishTank(String material,String shape,String dimension,double price,double capacity){ 
super(); 
this.material = material; 
this.shape = shape; 
this.dimension = dimension; 
this.price = price; 
this.capacity = capacity; 
} 
void displayFishTank(){ 
System.out.println("FishTank : [Material = "+material+", Shape = "+shape 
+", Dimension ="+dimension+", Price ="+price+", Capacity = "+capacity+"]"); 
} 
public void addFish(){ 
if(water !=null) 
fish = new Fish("Gold Fish","Fresh Water Fish",150,"Gold"); 
else 
System.out.println("Add water first."); 
} 
public void addWater(){ 
water = new Water("Distilled water",10,7); 
} 
public void addFood(){ 
food = new FishFood("Chitale",100,120); 
} 

 
 public void addPlant(){ 
  plant = new Plant("Java moss",100,"Green",10); 
 } 
 public void addLight(){ 
  light = new Light("Bajaj","Yellow",50,5); 
 } 
 public void addFilter(){ 
  filter = new Filter("Bajaj",1500,15,"3 l"); 
 } 
 public void addStone(){ 
  stone = new Stone("Circlular",100,5,5); 
 } 
} 
//3 
class Water { 
 String type; 
 double liter; 
 int ph; 
 Water(String type,double liter,int ph){ 
  super(); 
  this.type = type; 
  this.liter = liter; 
  this.ph = ph; 
 } 
 void displayWater(){ 
  System.out.println("Water : [Type = "+type+", Liter = "+liter+", ph = "+ph+"]"); 
 } 
} 
//4 
class FishFood 
{ 
 String brand; 
 double quantity; 
 double price; 
 FishFood(String brand,double quantity,double price){ 
  super(); 
  this.brand = brand; 
  this.quantity = quantity; 
  this.price = price; 
 } 
  void displaYFishFood(){ 
  System.out.println("FishFood : [Brand = "+brand+", Quantity = "+quantity+", price = "+price+"]"); 
  } 
} 

class Plant{ 
 String type; 
 double price; 
 String color; 
 int quantity; 
 Plant(String type,double price,String color,int quantity){ 
  super(); 
  this.type = type; 
  this.price = price; 
  this.color = color; 
  this.quantity = quantity; 
 } 
 
 
 
void displayPlant(){ 
System.out.println("Plant : [Type = "+type+", Price = "+price+", Color = "+color+ 
", Quantity : "+quantity+"]"); 
} 
} 

class Stone 
{ 
String shape; 
int quantity; 
double price; 
double weight; 
Stone(String shape,int quantity,double price,double weight){ 
super(); 
this.shape = shape; 
this.quantity = quantity; 
this.price = price; 
this.weight = weight; 
} 
void displayStone(){ 
System.out.println("Stone : [Shape = "+shape+", Quantity = "+quantity+", Price = "+price+ 
"rs, Weight : "+weight+" gm]"); 
} 
} 
//7 
class Light{ 
String brand; 
String color; 
double price; 
int watt; 
Light(String brand,String color,double price,int watt){ 
super(); 
this.brand = brand; 
this.color = color; 
this.price = price; 
this.watt = watt; 
} 
void displayLight(){ 
System.out.println("Light : [Brand = "+brand+", Color = "+color+ 
", Price = "+price+", Watt = "+watt+"]"); 
} 
} 
//8 
class Filter{ 
String brand; 
double price; 
double watt; 
String cap; 
Filter(String brand,double price,double watt,String cap){ 
this.brand = brand; 
this.price = price; 
this.watt = watt; 
this.cap = cap; 
} 
void displayFilter(){ 
System.out.println("Filter : [Brand = "+brand+", Price = "+price+ 
", Watt = "+watt+", Capacity = "+cap+"]"); 
} 
} 

class FishRelationship{ 
public static void main(String[] args){ 
FishTank tank = new FishTank("Glass","Rectangular","30h X 15w X50l",1000,12); 
tank.displayFishTank(); 
tank.addWater(); 
tank.water.displayWater(); 
tank.addFish(); 
tank.fish.displayFish(); 
tank.addFood(); 
tank.food.displaYFishFood(); 
tank.addPlant(); 
tank.plant.displayPlant(); 
tank.addLight(); 
tank.light.displayLight(); 
tank.addFilter(); 
tank.filter.displayFilter(); 
tank.addStone(); 
tank.stone.displayStone();
}
}