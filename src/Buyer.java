import java.util.List;
// Покупатель

public class Buyer extends Market {
    private String nameBuyer;
private Buyer buyer;
    public Buyer(boolean isMakeOrder, boolean isTakeOrder, String name, List<Buyer> buyerList, String name1, String nameBuyer) {
        super(isMakeOrder, isTakeOrder, name, buyerList);

        this.nameBuyer = nameBuyer;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    @Override
    public void acceptToMarket() {
        if (!buyerList.contains(buyer)) {
            buyerList.add(buyer);
            System.out.println("Покупатель пришел в магазин");
        } else {
            System.out.println("Покупателя уже в магазине");
        }
    }

    @Override
    public void releaseFromMarket() {
        if (!buyerList.contains(buyer)) {
            buyerList.remove(buyer);
            System.out.println("Покупатель ушел из магазина");
        } else {
            System.out.println("Покупателя нет в магазине");
        }
    }


    @Override
    public void update( ) {
        if (buyer != null) {
            if (!buyerList.contains(buyer)) {
                buyerList.add(buyer);
                System.out.println("Покупатель " + buyer.getNameBuyer() + " встал в очередь");
            } else {
                System.out.println("Покупатель " + buyer.getNameBuyer() + " уже в очереди");
            }
        } else {
            System.out.println("Ошибка: покупатель не может быть null.");
        }

        // Вывод сообщения, если список пустой
        if (buyerList.isEmpty()) {
            System.out.println("Покупателей нет");
        }
    }


    @Override
    public void takeInQueue() {

    }

    @Override
    public void takeOrder() {
if (buyerList.contains(getNameProduct())) {
    System.out.println("Покупатель взял товар");
}else{
    System.out.println("Покупатель не взял товар");
}
    }





    @Override
    public void getOrder() {
        boolean productFound  = false;
        for (Buyer product : getBuyerList()){
        if (buyer.getNameProduct().equals(buyer.getNameProduct())){
            productFound =true;
            System.out.println("Покупатель получил товар");
        }else {
            System.out.println("Покупатель не получил товар");
        }
        }


    }

    @Override
    public void releaseFromOrder() {

    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder();
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.setMakeOrder(makeOrder);
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder();
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.setTakeOrder(takeOrder);
    }

    @Override
    public String getNameProduct() {
        return super.getNameProduct();
    }
}
