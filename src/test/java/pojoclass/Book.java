package pojoclass;

import lombok.Data;

@Data
public class Book {
    private Book[] books;
    private BookPOJO bookPOJO;
}
