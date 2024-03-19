package library;

public interface LibrarySystem {
    void addBook(Book book);
    void registerMember(LibraryMember member);
    boolean borrowBook(String bookTitle, String memberId);
    boolean returnBook(String bookTitle, String memberId);
    boolean removeBook(String bookTitle); // New method
}