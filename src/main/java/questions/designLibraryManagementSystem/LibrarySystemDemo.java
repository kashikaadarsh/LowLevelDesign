package questions.designLibraryManagementSystem;

public class LibrarySystemDemo {
    public static void main(String [] args){
        Library library = new Library();
        Member member1 = new Member("kashika","kashika@gmail.com","123456789");
        Member member2 = new Member("kashika2","kashika2@gmail.com","1234562789");
        library.addMemberToLibrary(member1);
        library.addMemberToLibrary(member2);
        Book book1 = new Book("System Design 1","Alex Xu",10);
        Book book2 = new Book("System Design 2","Alex Xu",10);
        library.addBooks(book1);
        library.addBooks(book2);
        member1.issueBook(book1, 11);
    }
}
