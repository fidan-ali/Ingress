package az.library.model;

import java.sql.SQLOutput;

public class Reader {
    private int id;
    private String name;
    private Book[] borrowedBooks;
    private int count = 0;

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
        borrowedBooks = new Book[3];
    }

    public void borrow(Book book){
        if(count > 3){
            System.out.println(name + " artıq 3 kitab götürüb.");
            return;
        }

        if (book.isAvailable()) {
            borrowedBooks[count] = book;
            count++;
            book.borrowBook();
        } else {
            System.out.println("Bu kitab mövcud deyil.");
        }
    }

    public void printBorrowedBooks(){
        System.out.println(name + " götürdüyü kitablar:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + borrowedBooks[i]);
        }

    }
}
