class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }


  public class Polymorphism {
    public static void main(String[] args){
        var dog = new Dog();
        dog.animalSound();

        var pig = new Pig();
        pig.animalSound();

        var animal = new Animal();
        animal.animalSound();
    }

  }