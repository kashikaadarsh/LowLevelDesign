package questions.designLibraryManagementSystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Member extends Person{
    private List<Book> booksIssued = new ArrayList<>();

    public Member(String username, String useremail, String usermobile) {
        super(username, useremail, usermobile);
    }
    public void issueBook(Book book, int numberOfCopies){
        if(book.getTotalCopies()<numberOfCopies){
            System.out.println("Not sufficent copies available");
        }
        book.removeCurrentCopies(numberOfCopies);
        booksIssued.add(book);

    }
    public void returnBook(Book book, int numberOfCopies){
        book.addCurrentCopies(numberOfCopies);
        book.makeAvailable();
    }
}
