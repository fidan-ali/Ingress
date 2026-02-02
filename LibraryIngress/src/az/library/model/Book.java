package az.library.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public void printInfo(){
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + available);
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook(){
        if(available){
            available = false;
            System.out.println("You borrowed the Book " + title);

        }
        else{
            System.out.println("This Book is taken.");
        }
    }

    public void returnBook(){
        available = true;
        System.out.println(title + " is returned.");
    }
}
