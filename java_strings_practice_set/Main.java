//parent class Animal
class Animal {
    private String name;
    private int age ;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void makeSound(){
        System.out.println("...");

    }
    
}
// Child class Dog

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("woof woof");
    }
    
}
// Child class Cat

class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Meow meow");
    }
}

//Main Class

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); // you can make Object like this Dog dog = new Dog(); but this is not professional 
        Animal cat= new Cat();
        dog.setName("Hi I'm Pillu");
        dog.setAge(3);
        cat.setName("Hi I'm Billu");
        cat.setAge(2);

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.makeSound();

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.makeSound();
        
        
        
    }
}
