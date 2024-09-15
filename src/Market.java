import java.util.List;
import java.util.Objects;

public abstract class Market implements QueueBehaviour, MarketBehaviour {
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected final String nameProduct;
    protected List<Buyer> buyerList;



    public Market(boolean isMakeOrder, boolean isTakeOrder, String name,List<Buyer> buyerList) {
        this.isMakeOrder = isMakeOrder;
        this.isTakeOrder = isTakeOrder;
        this.nameProduct = name;
        this.buyerList = buyerList;
    }

    public List<Buyer> getBuyerList() {
        return buyerList;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {this.isMakeOrder = makeOrder;}

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Market market = (Market) o;
        return isMakeOrder == market.isMakeOrder && isTakeOrder == market.isTakeOrder && Objects.equals(nameProduct, market.nameProduct) && Objects.equals(buyerList, market.buyerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isMakeOrder, isTakeOrder, nameProduct, buyerList);
    }

    @Override
    public String toString() {
        return "Market{" +
                "isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder +
                ", nameProduct='" + nameProduct + '\'' +
                ", buyerList=" + buyerList +
                '}';
    }
}




