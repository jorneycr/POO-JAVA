package animal_polymorphism;

public class Main {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog();
        ((Dog)sasha).makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();

        boolean isDog = sasha instanceof Animal;
        System.out.println(isDog);
        feed(sasha);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("feeding your dog");
        } else if (animal instanceof  Cat) {
            System.out.println("feeding your cat");
        }
    }
}
