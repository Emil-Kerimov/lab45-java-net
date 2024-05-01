package tcpWork.operation;

public class CardInfoOperation extends CardOperation{
    private String serNum;

    public CardInfoOperation(String serNum){
        this.serNum = serNum;
    }

    public String getSerNum() {
        return serNum;
    }
}
