package core;
import animal.*;

public class Main{
    static void main() {

        Sausage s = new Sausage(30);
        Cat c = new Cat("mano", 50);
        Owner o = new Owner("Saad", c);
        o.feedCat(s);
        c.eat(s);
        System.out.println("Cat Energy Level: "+c.getEnergy());

    }

}