package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        this.id = anotherBook.id;
        this.title = anotherBook.title;
        this.author = anotherBook.author;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if(obj == null || !(obj instanceof Book)) {
            return false;
        }
        else {
            Book that = (Book)obj;
            if(this.id.equals(that.id)) {
                return true;
            }
        }
        return false;
    }
}
