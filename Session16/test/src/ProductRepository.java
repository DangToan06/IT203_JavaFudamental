import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository implements IRepository<Product> {

    private ArrayList<Product> listProducts;
    private HashMap<String, Product> productHashMap;

    public ProductRepository() {
        listProducts = new ArrayList<>();
        productHashMap = new HashMap<>();
    }

    @Override
    public boolean add(Product item) {
        if(listProducts.add(item) ) {
            productHashMap.put(item.getId(), item);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeById(String id) {
        for (int i = 0; i < listProducts.size(); i++) {
            Product product = listProducts.get(i);
            if(product.getId().equals(id)) {
                listProducts.remove(i);
                productHashMap.remove(product.getId());
                return true;
            }
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        if(productHashMap.containsKey(id)) {
            return  productHashMap.get(id);
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return listProducts;
    }
}
