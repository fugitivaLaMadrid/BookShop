package product.database;

import product.business.Book;
import product.business.Product;
import product.business.Ebook;

public class ProductDB {


    public static Product getProduct(String productCode) {


        Product product = null;

        String code1 = "Anna Karenina";
        String code2 = "To Kill a Mockingbird";
        String code3 = "The Great Gatsby";
        String code4 = "One Hundred Years of Solitude";
        String code5 = "A Passage to India";
        String code6 = "Invisible Man";
        if (productCode.equalsIgnoreCase(code1)
                || productCode.equalsIgnoreCase(code2)
                || productCode.equalsIgnoreCase(code3)
                || productCode.equalsIgnoreCase(code4)) { //start outer if
            Book book = new Book();
            if (productCode.equalsIgnoreCase(code1)) {//start inner if
                book.setCode(productCode);
                book.setDescription("Anna Karenina");//calling method from superclass Product
                book.setPrice(35.50);//calling method from superclass Product
                book.setAuthor("Clarence Brown");
            } else if (productCode.equalsIgnoreCase(code2)) {
                book.setCode(productCode);
                book.setDescription("To Kill a Mockingbird");//calling method from superclass Product
                book.setPrice(40.00);//calling method from superclass Product
                book.setAuthor("Harper Lee's");
            } else if (productCode.equalsIgnoreCase(code3)) {
                book.setCode(productCode);
                book.setDescription("The Great Gatsby");
                book.setPrice(25.50);
                book.setAuthor("F. Scott Fitzgerald");
            } else if (productCode.equalsIgnoreCase(code4)) {
                book.setCode(productCode);
                book.setDescription("One Hundred Years of Solitude");//calling method from superclass Product
                book.setPrice(54.50);//calling method from superclass Product
                book.setAuthor("Gabriel García Márquez");
            }

            product = book;
        }

        else if (productCode.equalsIgnoreCase(code5)
                    || productCode.equalsIgnoreCase(code6)) {
                Ebook software = new Ebook();
                if (productCode.equalsIgnoreCase(code5)) {//inner if evaluate softwares
                    software.setCode("A Passage to India");
                    software.setDescription("it as a great work of fiction");//calling method from superclass Product
                    software.setPrice(18.00);//calling method from superclass Product
                    software.setYearPublish(1924);
                } else if (productCode.equalsIgnoreCase(code6)) {
                    software.setCode("Invisible Man");
                    software.setDescription("Ralph Ellison");//calling method from superclass Product
                    software.setPrice(10.00);//calling method from superclass Product
                    software.setYearPublish(1953);
                }

            product = software;
        }

            return product;
        }
}

