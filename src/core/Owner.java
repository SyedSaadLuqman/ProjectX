package core;
import animal.Cat;

public class Owner {
    private String name;
    private Cat cat;

    public Owner(String name, Cat cat) {
        this.name = name;
        this.cat = cat;
    }

    public void feedCat(Food food){
        cat.eat(food);
    }
}
