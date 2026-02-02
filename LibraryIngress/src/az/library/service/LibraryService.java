package az.library.service;

import az.library.model.Book;

import az.library.service.LibraryService;

public class LibraryService {
    Book[] books;
    private int index = 0;
    static int totalBooks;

    public LibraryService(Book[] books) {
        this.books = books;
    }

   /* public void addBook(Book book){
        if (index < books.length) {
            books[index] = book;
            index++;
            totalBooks++;
        } else {
            System.out.println("Kitabxana doludur.");
        }
    }

    public void listAvailableBooks() {
        System.out.println("Mövcud kitablar:");
        for (int i = 0; i < index; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }*/
}
