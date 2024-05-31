public class AccessModifier {
    public static void main(String[] args) {
        BankAccount act = new BankAccount();
        act.username = "Ayushi";
        act.setPassword("abc"); // act.password (not accesebile as it is private)
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}