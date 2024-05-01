package tcpWork;

public class MetroCard implements java.io.Serializable {
    private String serNum;
    private String colledge;
    private User user;
    private double balance;

    public MetroCard(String serNum, String colledge, User user, double balance) {
        this.serNum = serNum;
        this.colledge = colledge;
        this.user = user;
        this.balance = balance;
    }

    public MetroCard() {}

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public String getColledge() {
        return colledge;
    }

    public void setColledge(String college) {
        this.colledge = college;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public boolean pay(double money){
        if (balance - money < 0)return false;
        balance -= money;
        return true;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "No: " + serNum + "\nUser: " + user +
                "\nColledge: " + colledge +
                "\nBalance: " + balance;
    }
}
