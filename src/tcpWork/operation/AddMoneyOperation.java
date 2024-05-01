package tcpWork.operation;

public class AddMoneyOperation extends CardOperation {
    private String serNum = null;
    private double money = 0.0;
    public AddMoneyOperation(String serNum, double money) {
        this.serNum = serNum;
        this.money = money;
    }

    public String getSerNum() {
        return serNum;
    }

    public double getMoney() {
        return money;
    }
}
