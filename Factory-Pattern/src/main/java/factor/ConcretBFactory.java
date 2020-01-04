package factor;

import product.ConcreteProductB;
import product.Product;

public class ConcretBFactory implements Factory {
    public Product getProduct() {
        return new ConcreteProductB();
    }
}
