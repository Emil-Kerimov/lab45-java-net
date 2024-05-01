package tcpWork.operation;

public class ShowUserInfoOperation extends CardOperation {
    private String serNum;

    public ShowUserInfoOperation(String surNum) {
        this.serNum = surNum;
    }

    public String getSerNum() {
        return serNum;
    }
}
