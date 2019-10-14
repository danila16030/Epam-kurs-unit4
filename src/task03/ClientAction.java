package task03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ClientAction {
    public int totalInvoiceAmount(Client client) {
        int sum = 0;
        for (Bill bill : client.getBillList()) {
            sum += bill.getMoney();
        }
        return sum;
    }

    public int totalPositiveAmount(Client client) {
        int positiveSum = 0;
        for (Bill bill : client.getBillList()) {
            if (bill.getMoney() > 0&&!bill.isBlock()) {
                positiveSum += bill.getMoney();
            }
        }
        return positiveSum;
    }

    public int totalNegativeAmount(Client client) {
        int negativeSum = 0;
        for (Bill bill : client.getBillList()) {
            if (bill.getMoney() < 0&&!bill.isBlock()) {
                negativeSum += bill.getMoney();
            }
        }
        return negativeSum;
    }

    public Bill findBill(Client client, String billNumber) {
        for (Bill bill : client.getBillList()) {
            if (bill.getBillNumber().equals(billNumber)) {
                return bill;
            }
        }
        return null;
    }


    public Client sortOnMoneyAmount(Client client) {
        Collections.sort(client.getBillList(), Comparator.comparing(Bill::getBillNumber));
        return client;
    }
}