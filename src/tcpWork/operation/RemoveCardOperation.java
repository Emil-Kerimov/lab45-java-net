package tcpWork.operation;


public class RemoveCardOperation extends CardOperation {
    private String serNum = null;
    public RemoveCardOperation(String serNum) {
        this.serNum = serNum;
    }

    public String getSerNum() {
        return serNum;
    }
    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }
}