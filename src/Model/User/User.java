package Model.User;

import java.util.HashSet;
import java.util.Set;

public class User {

    private int id;
    private String name;
    private int age;
    private Set<Integer> collectionOfBooks = new HashSet<>();

    public void addBook(int bookId){
        collectionOfBooks.add(bookId);
    }
    public void removeBook(int bookId){
        collectionOfBooks.remove(bookId);
    }

    public Set<Integer> getCollection(){
        return collectionOfBooks;
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Integer> getCollectionOfBooks() {
        return collectionOfBooks;
    }

    public void setCollectionOfBooks(Set<Integer> collectionOfBooks) {
        this.collectionOfBooks = collectionOfBooks;
    }
}
