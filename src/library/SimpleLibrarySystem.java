package library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLibrarySystem implements LibrarySystem {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, LibraryMember> members = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    @Override
    public void registerMember(LibraryMember member) {
        members.put(member.getMemberId(), member);
    }

    @Override
    public boolean borrowBook(String bookTitle, String memberId) {

        Book book = books.get(bookTitle);
        LibraryMember member = members.get(memberId);

        if (book != null && member != null && book.isAvailable()){
            member.borrowBook(book);
            return true;
        }

        return false;
    }

    @Override
    public boolean returnBook(String bookTitle, String memberId) {

        Book book = books.get(bookTitle);
        LibraryMember member = members.get(memberId);

        if (book != null && member != null){
            member.returnBook(book);
            return true;
        }

        return false;
    }

    @Override
    public boolean removeBook(String bookTitle) {
        if (books.containsKey(bookTitle)){
            books.remove(bookTitle);
            System.out.println(bookTitle + " has been removed from the library.");
            return true;
        }else {
            System.out.println("Book is not found in the library.");
            return false;
        }

    }


    //


    public void listAllBooks() {
        if (books.isEmpty()){
            System.out.println("No books available in the Library.");
        }else {
            books.values().forEach(book -> System.out.println(book.getTitle() + " by "
                    + book.getAuthor() + (book.isAvailable() ? " (Available)" : " (Borrowed)" )));
        }
    }

    public void listAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No regitered members in the Library.");
        } else {
            System.out.println("Library Members:");
            members.values()
                    .forEach(member ->
                            System.out.println(member.getName() +
                                    " (ID: " + member.getMemberId() + ")"));
        }
    }

    public void showBorrowedBooks() {
        if (members.isEmpty()){
            System.out.println("No borrowing information available.");
        }else {
            System.out.println("Borrowed Books:");
            members.values().forEach(member -> {
                System.out.println("Member: " + member.getName());
                member.getBooksBorrowed().forEach(book -> System.out.println(" - "+ book.getTitle()));
            });
        }
    }
}