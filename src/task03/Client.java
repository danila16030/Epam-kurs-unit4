package task03;

import java.util.List;

public class Client {
    private List<Bill> billList;
    private String clientName;

    public Client(List<Bill> billList, String clientName) {
        this.billList = billList;
        this.clientName = clientName;
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public String getClientName() {
        return clientName;
    }
}
