import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SuppliesIteratorService implements Iterator<Product> {
    private int count;
    private  final List<Product> productList;

    public SuppliesIteratorService(Supplies product) {
        this.count = 0;
        this.productList = product.getSupplies();
    }

    @Override
    public boolean hasNext() {
        return (count < productList.size());
        }

        @Override
        public Product next () {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return productList.get(count++);
        }

        @Override
        public void remove () {
            productList.remove(count-1 );
        }
    }

