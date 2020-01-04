package factor;

import product.ConcretProductA;
import product.Product;

public class ConcretAFactory implements Factory {
    public Product getProduct() {
        return new ConcretProductA();
    }
}
