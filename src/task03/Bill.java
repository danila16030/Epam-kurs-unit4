package task03;

public class Bill {
    private String billNumber;
    private boolean block;
    private int money;

    public Bill(String billNumber, boolean block, int money) {
        this.billNumber = billNumber;
        this.block = block;
        this.money = money;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public boolean isBlock() {
        return block;
    }

    public int getMoney() {
        return money;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }
}
