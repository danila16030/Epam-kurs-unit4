package task03;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return block == bill.block &&
                money == bill.money &&
                Objects.equals(billNumber, bill.billNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billNumber, block, money);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billNumber='" + billNumber + '\'' +
                ", block=" + block +
                ", money=" + money +
                '}';
    }
}
