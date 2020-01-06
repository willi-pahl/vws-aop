package de.pahl.bhsb.shop.product;

/**
 * Product.
 *
 * @author pahl
 *
 */
public class Product implements InterfaceProduct {

    /**
     * Product name.
     */
    private String pName;

    /**
     * Product system id.
     */
    private String pSku;

    /**
     * Product single price.
     */
    private double pSinglePrice;

    /**
     * Get product name.
     */
    @Override
    public String getName() {
        return this.pName;
    }

    /**
     * Construct.
     *
     * @param sku System product id.
     */
    public Product(final String sku) {
        this.pSku = sku;
    }

    /**
     * Set product name.
     */
    @Override
    public InterfaceProduct setName(final String name) {
        this.pName = name;
        return this;
    }

    /**
     * Get product sku.
     */
    @Override
    public String getSku() {
        return this.pSku;
    }

    /**
     * Set product sku.
     */
    @Override
    public InterfaceProduct setSku(final String sku) {
        this.pSku = sku;
        return this;
    }

    /**
     * Get product single price.
     */
    @Override
    public double getSinglePrice() {
        return this.pSinglePrice;
    }

    /**
     * Set product single price.
     */
    @Override
    public InterfaceProduct setSinglePrice(final double singlePrice) {
        this.pSinglePrice = singlePrice;
        return this;
    }

}
