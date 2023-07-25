package animal_polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void scratch(){
        System.out.println("Im a cat");
    }
}
