package product.business;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0;
    private double total;


    public Product() { }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        this.calculateTotal();
        return total;
    }

    private void calculateTotal() {
        total = count * price ;
    }

    public String getPriceFormatted() {

        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String priceFormatted = currency.format(price);
        return priceFormatted;
    }

    @Override
    public String toString() {
        return description;
    }

    public static int getCount() {
        return count;
    }

    //display codes
    public static String displayCodes(){
       String code1 = "Anna Karenina";
        String code2 = "To Kill a Mockingbird";
        String code3 = "The Great Gatsby";
        String code4 = "One Hundred Years of Solitude";
        String code5 = "E-book:: A Passage to India";
        String code6 = "E-Book:: Invisible Man";
        String  displayCodes = "Product names and code::" + "\n" +
                                "For Anna Karenina - code:: " + code1    + "\n"    +
                                "For To Kill a Mockingbird - code:: " +code2 + "\n"             +
                                "For The Great Gatsby - code:: " +code3 + "\n"               +
                                "For One Hundred Years of Solitude - code:: " +code4 + "\n" +
                                "For A Passage to India - code:: " +code5 + "\n"+
                                "For Invisible Man - code:: " +code6;

        System.out.println(displayCodes);
        return displayCodes;

    }
}