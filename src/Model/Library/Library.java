package Model.Library;

import Model.Book.Book;
import Model.User.User;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<Integer, Book> booksSet = new HashMap();
    private final Map<Integer, User> userSet = new HashMap<>();

    public void addBook(int id, String title, String author, String releaseYear) {
        booksSet.put(id, new Book(id, title, author, releaseYear));
    }

   public Book getBookId(int id){
        return booksSet.get(id);
   }

   public void addUser(User user){
        userSet.put(user.getId(), user);
   }

   public User getUserId(int id){
        return userSet.get(id);
   }

}
