package animal;
import core.Food;

public abstract class Animal {

    private int energy;

    public Animal(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public abstract String makeSound();

    public void eat(Food food){
        energy = energy + food.getNutrition();
    }



}
