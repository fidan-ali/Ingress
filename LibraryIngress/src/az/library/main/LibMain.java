package az.library.main;

import az.library.model.Book;
import az.library.model.Reader;

public class LibMain {
    public static void main(String[] args){
        Book book1 = new Book(1, "Down and out in Paris and London", "George Orwell", true);
        Book book2 = new Book(2, "1984", "George Orwell", false);
        Book book3 = new Book(3, "Satc", "Carrie Bradshaw", true);


        Reader reader1 = new Reader(1, "Fidan");
        reader1.borrow(book1);
        reader1.borrow(book2);
    }
}
