import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket();// todo  Покупатель пришел в магазин
    void releaseFromMarket();// todo Покупатель ушел из магазина
    void update();// todo Камеры наблюдения вычесляют есть ли покупатель в магазине,стоят ли они в очереди
}
