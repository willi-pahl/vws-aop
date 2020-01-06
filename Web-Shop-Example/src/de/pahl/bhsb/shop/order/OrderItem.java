package de.pahl.bhsb.shop.order;

import de.pahl.bhsb.shop.product.InterfaceProduct;

public class OrderItem implements InterfaceOrderItem {

    /**
     * Product quantity.
     */
    private int  productQuantity;

    /**
     * Product.
     */
    private InterfaceProduct itemProduct;

    /**
     * Product single price.
     */
    private double  productPrice;

    /**
     * Sku of product.
     *
     * @param product Product.
     */
    public OrderItem(final InterfaceProduct product) {
        this.itemProduct = product;
    }

    /**
     * Define the single price for product.
     */
    @Override
    public OrderItem definiePrice(final double singlePrice) {
        this.productPrice = singlePrice;
        return this;
    }

    /**
     * Set the quantity for item.
     */
    @Override
    public OrderItem definieQuantity(final int quantity) {
        this.productQuantity = quantity;
        return this;
    }

    /**
     * Get item price.
     */
    @Override
    public double getItemPrice() {
        int quantity = 0;
        double price = 0.0;

        if (this.productQuantity > 0) {
            quantity = this.productQuantity;
        } else {
            return 0.0;
        }

        if (this.productPrice >= 0) {
            price = this.productPrice;
        } else {
            this.itemProduct.getSinglePrice();
        }

        return quantity * price;
    }

}
