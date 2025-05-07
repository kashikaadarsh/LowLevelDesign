package questions.designLibraryManagementSystem;

public class Person {
    private int userId;
    private String username;
    private String useremail;
    private String usermobile;

    public Person(String username,String useremail, String usermobile){
        this.useremail = useremail;
        this.username = username;
        this.usermobile = usermobile;
    }
}
