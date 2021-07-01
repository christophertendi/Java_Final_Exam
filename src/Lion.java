public class Lion extends Animal
{
    private int meatWeight;

    public int getMeatWeight() {
        return meatWeight;
    }

    public void setMeatWeight(int meatWeight) {
        this.meatWeight = meatWeight;
    }

    public Lion(String name, int weight, int meatWeight)
    {
        super(name, weight);
        this.meatWeight = meatWeight;

    }

}
