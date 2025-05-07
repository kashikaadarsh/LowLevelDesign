package questions.designAmazon;

import java.util.List;

public interface Search {
    List<Product> searchProductByName(String name);
    List<Product> searchProductByTag(String tag);

}

