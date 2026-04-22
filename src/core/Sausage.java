package core;

public class Sausage implements Food{
    private int nutrition;

    public Sausage ( int n){
        nutrition = n;
    }

    @Override
    public int getNutrition() {
        return nutrition;
    }

}
