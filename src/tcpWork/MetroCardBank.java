package tcpWork;

import java.util.Hashtable;
import java.util.Map;

public class MetroCardBank implements java.io.Serializable {
    private Map<String, MetroCard> store;
    public MetroCardBank(){
        store = new Hashtable<>();
    }

    public int numCard(){
        return store.size();
    }

    public boolean addCard(MetroCard metroCard){
        return null == store.put(metroCard.getSerNum(), metroCard);
    }

    public boolean removeCard(String serNum){
        MetroCard tmp = store.remove(serNum);
        return tmp != null;
    }

    public boolean addMoney(String serName,double money){
        MetroCard card = store.get(serName);
        card.setBalance(card.getBalance() + money);
        return true;
    }

    public boolean getMoney(String  serName, double money){
        return store.get(serName).pay(money);
    }

    public Map<String,MetroCard> getStore() {
        return store;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("List of MetroCards:");
        store.values().forEach(e -> {
            sb.append("\n\n").append(e);
        });
        return sb.toString();
    }

}
