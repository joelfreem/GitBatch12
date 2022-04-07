package Class25;

public class BankAccount {
   private double balance=523322;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username="Jojo";
   private String password="Swagger";
    void printBalance(String username,String password){
        if(username.equals(this.username)&&password.equals(this.password)){
            System.out.println(balance);
        }else{
            System.out.println("Username or password not correct");
        }
    }
}
