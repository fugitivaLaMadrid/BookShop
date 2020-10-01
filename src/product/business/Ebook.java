package product.business;

public class Ebook extends Product {

    private int yearPublish;

    public Ebook() {
        super();
        yearPublish = 0;
        count++;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    @Override
    public String toString() {
        return super.toString() + " " + yearPublish;
    }
}