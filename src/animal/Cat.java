package animal;

public class Cat extends Animal{

    private String name;

    public Cat(String name, int energy) {
        super(energy);
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "meow";
    }

    public void jump(){
        //do something
    }
}
