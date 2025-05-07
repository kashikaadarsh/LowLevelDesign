package questions.designLibraryManagementSystem;
enum BookStatus{
    AVAILABLE,
    NOT_AVAILABLE
}
public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private int totalCopies;
    private int currentCopies;
    private BookStatus bookStatus;

    public Book(String bookName, String author, int totalCopies){
        this.bookName = bookName;
        this.author = author;
        this.totalCopies = totalCopies;
        this.currentCopies = totalCopies;
    }
    public String getBookName(){
        return this.bookName;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getTotalCopies(){
        return this.totalCopies;
    }
    public int getCurrentCopies(){
        return this.currentCopies;
    }
    public void addCurrentCopies(int x){
        this.currentCopies = this.currentCopies + x;

    }
    public void removeCurrentCopies(int x){
        this.currentCopies = this.currentCopies - x;

    }
    public void makeAvailable(){
        this.bookStatus = BookStatus.AVAILABLE;
    }
}
