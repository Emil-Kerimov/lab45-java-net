package tcpWork.operation;


public class ShowBalanceOperation extends CardOperation {
    private String surName;

    public ShowBalanceOperation(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }
}
