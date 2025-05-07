package questions.designLibraryManagementSystem;
enum AccountStatus{
    ACTIVE,
    DELETED,
    BLACKLISTED
}
public class Account {
    private int accountId;
    private String username;
    private String password;
    private AccountStatus accountStatus;
    public Account(String username, String password){
        this.username = username;
        this.password = password;
        this.accountStatus = AccountStatus.ACTIVE;
    }

    public void updatePassword(String newPassword){
        this.password = newPassword;
    }

}
