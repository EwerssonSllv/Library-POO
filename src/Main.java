import Model.Book.Book;
import Model.Library.Library;
import Model.User.User;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(1, "The Lord of The Rings", "J.R.R Tolkien", "1954");
        library.addBook(2, "The Chronicles of Narnia", "C.S Lewis", "1950");

        User user1 = new User(1, "Ewersson", 19);

        user1.addBook(1);
        user1.addBook(2);

        for(int bookId : user1.getCollectionOfBooks()){
            Book book = library.getBookId(bookId);
            System.out.println(book.getTitle());
        }
    }
}