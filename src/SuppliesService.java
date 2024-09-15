import java.util.Iterator;
// Сделал что бы в дальнейшем в main можно было перебрать список и вывести содержимое
public class SuppliesService {
    private Supplies supplies;
    public void showProduct(String name) {
        Iterator<Product> iterator = supplies.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
            }
        }
    }

