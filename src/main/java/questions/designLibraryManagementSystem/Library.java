package questions.designLibraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private int libraryId;
    List<Person> listOfMembers = new ArrayList<>();
    Map<String,List<Book>> listOfBooks = new HashMap<>();

    public void addMemberToLibrary(Member member){
        listOfMembers.add(member);
    }
    public void removeMemberToLibrary(Member member){
        listOfMembers.remove(member);
    }
    public void addBooks(Book book){
        listOfBooks.putIfAbsent(book.getBookName(),new ArrayList<>());
        listOfBooks.get(book.getBookName()).add(book);
    }
    public List<Book> searchBookByName(String name){
        return listOfBooks.getOrDefault(name,new ArrayList<>());

    }
    public List<Book> searchBookByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        for(List<Book> book: listOfBooks.values()){
            for(Book curBook: book){
                if(curBook.getAuthor()==author){
                    booksByAuthor.add(curBook);
                }
            }
        }
        return booksByAuthor;
    }

}
