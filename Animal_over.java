class Animal{
    public void sound(){
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat meow");
    }
}

class Animal_over{
    public static void main(String args[]){
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}