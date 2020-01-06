package de.pahl.bhsb.shop.test;

import de.pahl.bhsb.shop.product.Product;
import de.pahl.bhsb.shop.product.ProductList;

/**
 * Test product list.
 *
 * @author pahl
 *
 */
public final class ProductListTest {

    /**
     * Construct.
     */
    private ProductListTest() {
        ProductList list = new ProductList();

        for (Product p : ProductFactory.getProducts()) {
            list.addProduct(p);
        }
    }

    /**
     * Main method.
     *
     * @param args Params from console.
     */
    public static void main(final String[] args) {
        new ProductListTest();
    }

}
