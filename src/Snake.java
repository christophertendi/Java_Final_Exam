public class Snake extends Animal
{
    public int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Snake(String name, int weight, int length)
    {
        super(name, weight);
        this.length= length;
    }


}
