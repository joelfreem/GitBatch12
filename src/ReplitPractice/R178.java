package ReplitPractice;

public class R178 {
    public static void main(String[] args) {
        Account account=new Account();
        account.getAcc_no();
        account.getName();
        account.getEmail();
        account.getAmount();
    }
}
class Account {
    int acc_no;
    String name;
    String email;
    double amount;


    public double getAcc_no() {
        acc_no = 756050400;
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        name = "Sumair";
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getEmail() {
        email = "sumair@syntax.com";
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        amount = 50000;
        return amount;

    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
