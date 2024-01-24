public class AccessModifiers {
    public static void main(String args[]){
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Ayushi Anand";
        // we can't access private 
        //myAccount.password = "5Ayushi@#";
        myAccount.setPassword("5Ayushi@#");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

/*
 * Access Modifier
 * Private (within class)
 * Default (within class, within package)
 * Protected (within class, within package, outside package by subclass only)
 * Public(within class, within package, outside package by subclass only, outside package)
 */