package task03;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(billList, client.billList) &&
                Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billList, clientName);
    }

    @Override
    public String toString() {
        return "Client{" +
                "billList=" + billList +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
