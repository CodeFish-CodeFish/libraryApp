package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private String memberId;
    private List<Book> booksBorrowed;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.booksBorrowed = new ArrayList<>();
    }

    public void borrowBook(Book book) {
      if (book != null && book.isAvailable()){
          book.setAvailable(false);
          booksBorrowed.add(book);
      }
    }

    public void returnBook(Book book) {
       if (book != null && booksBorrowed.contains(book)){
           book.setAvailable(true);
           booksBorrowed.remove(book);
       }
        
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<Book> getBooksBorrowed() {
        return new ArrayList<>(booksBorrowed);
    }
}












