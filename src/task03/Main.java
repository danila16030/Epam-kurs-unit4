package task03;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bill bill1=new Bill("a678g",false,759);
        Bill bill2=new Bill("a78ad",false,859);
        Bill bill3=new Bill("C787g",false,-159);
        Bill bill4=new Bill("P785g",false,-59);
        List<Bill> billList = new ArrayList<>();
        billList.add(bill1);
        billList.add(bill2);
        billList.add(bill3);
        billList.add(bill4);
        Client client=new Client(billList,"Pol");
        ClientAction clientAction=new ClientAction();
        client=clientAction.sortOnMoneyAmount(client);//sort
        int positiveAmount=clientAction.totalPositiveAmount(client);//+money
        int negativeAmount=clientAction.totalNegativeAmount(client);//-money
        int invoiceAmount=clientAction.totalInvoiceAmount(client);//all money
        Bill bill=clientAction.findBill(client,"a678g8");
    }

}
