public class Monkey extends Animal
{
    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    private String favoriteFood;

    public Monkey(String name, int weight, String favoriteFood)
    {
        super(name, weight);
        this.favoriteFood = favoriteFood;
    }
}
