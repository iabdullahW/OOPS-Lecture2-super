class Animal{
    
    String color ="white";
}

class Dog extends Animal {
    String color ="black";
    
    void printColor(){
        
        System.out.println("second color:"+ color);
        
        System.out.println("white color:"+ super.color);
    }
    
}

class Lecture7{
   public static void main (String[] args) {
      
      
      Dog obj = new Dog();
      obj.printColor();
    }
}