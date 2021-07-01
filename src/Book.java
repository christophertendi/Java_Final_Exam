public class Book
{
    private String title;
    private double price;
    private int yearPublished;
    private String author;

    //getter setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String author, String title, double price, int yearPublished)
    {
        this.title = title;
        this.price = price;
        this.yearPublished= yearPublished;
        this.author = author;

    }
    public static void main (String args[])
    {
        Book book1 = new Book("Raymond Bahana", "Superheroes are real",15.50,1719);
        Book book2 = new Book("Nunung Nurul", "Falling in Love with Polymorphism", 12.80,1902);
        Book book3 = new Book("Jude Martinez","Bleh Bleh Bleh Bleh",12.80,1902);
        Book book4 = new Book("Ida Bagus","The Young Doctor",900,1974);

    }

}





