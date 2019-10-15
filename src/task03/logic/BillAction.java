package task03.logic;

import task03.entity.Bill;

public class BillAction {
    public Boolean blockBill(Bill bill) {
        if (!bill.isBlock()) {
            bill.setBlock(true);
        }
        return true;
    }
}
