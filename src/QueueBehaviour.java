import java.util.List;

public interface QueueBehaviour {
    void takeInQueue();
    void takeOrder();// todo Статус товара
    void getOrder();// todo Получение товара
    void releaseFromOrder();
}
