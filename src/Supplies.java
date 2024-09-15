import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//todo Создал этот класс что бы в дальнейшем пользоваться итератором
public class Supplies implements Iterable<Product>{
    private List<Product> productList;

    public Supplies(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getSupplies() {
        return productList;
    }

    public void setSupplies(List<Product> supplies) {
        this.productList = supplies;
    }

    @Override
    public Iterator<Product> iterator() {
        return new SuppliesIteratorService(this);
    }
}
