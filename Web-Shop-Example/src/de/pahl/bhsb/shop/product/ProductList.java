package de.pahl.bhsb.shop.product;

import java.util.HashMap;

/**
 * Managed all products.
 *
 * @author pahl
 *
 */
public class ProductList {

    /**
     * All products.
     */
    private HashMap<String, InterfaceProduct> productList;

    /**
     * Initialize class params.
     */
    public ProductList() {
        this.productList = new HashMap<String, InterfaceProduct>();
    }

    /**
     * Add new product to list.
     *
     * @param newProduct Product that add to list.
     */
    public void addProduct(final InterfaceProduct newProduct) {
        this.productList.put(newProduct.getSku(), newProduct);
    }

    /**
     * Get product from sku.
     *
     * @param sku Sku from product.
     *
     * @return Product that find in list.
     */
    public InterfaceProduct getProduct(final String sku) {
        return this.productList.get(sku);
    }

    /**
     * Get Product from product. The sku is required.
     *
     * @param product Product that search.
     *
     * @return Find product.
     */
    public InterfaceProduct getProduct(final InterfaceProduct product) {
        return this.getProduct(product.getSku());
    }
}
