package de.pahl.bhsb.shop.test;

import de.pahl.bhsb.shop.product.Product;

/**
 * Product factory, helper class.
 *
 * @author pahl
 *
 */
public final class ProductFactory {

    /**
     * Count of products in list.
     */
    private static final int PRODUCT_COUNTS = 10;

    /**
     * Base proce for calc.
     */
    private static final double MAIN_PRICE = 2.3;

    /**
     * Private Construct.
     */
    private ProductFactory() {

    }

    /**
     * Get list whit products.
     *
     * @return Product list.
     */
    public static Product[] getProducts() {
        Product[] list = new Product[PRODUCT_COUNTS];

        for (int i = 1; i < (PRODUCT_COUNTS + 1); i++) {
            Product p = new Product(i + "");
            p.setName("Name-" + i).setSinglePrice(MAIN_PRICE * i);
            list[i - 1] = p;
        }

        return list;
    }
}
