package de.pahl.bhsb.shop.product;

/**
 * Product interface.
 *
 * @author pahl
 *
 */
public interface InterfaceProduct {

    /**
     * Get product name.
     *
     * @return Product name.
     */
    String getName();

    /**
     * Set product name.
     *
     * @param name Product name.
     *
     * @return The Product.
     */
    InterfaceProduct setName(String name);

    /**
     * Get product system id.
     *
     * @return Product system id.
     */
    String getSku();

    /**
     * Set product system id.
     *
     * @param sku Product system id.
     *
     * @return The Product.
     */
    InterfaceProduct setSku(String sku);

    /**
     * Get product single price.
     *
     * @return Product single price.
     */
    double getSinglePrice();

    /**
     * Set product single price.
     *
     * @param singlePrice Product single price.
     *
     * @return The Product.
     */
    InterfaceProduct setSinglePrice(double singlePrice);

}
