package de.pahl.bhsb.shop.order;

import de.pahl.bhsb.shop.product.InterfaceProduct;

public interface InterfaceOrder {

    /**
     * Set the order id.
     *
     * @param id Order id.
     *
     * @return Order.
     */
    InterfaceOrder setOrderId(String id);

    /**
     * Get order id.
     *
     * @return Order id.
     */
    String getOrderId();

    /**
     * set products.
     *
     * @param products Products.
     */
    void setProductList(InterfaceProduct...products);

    /**
     * Get the total price for order.
     *
     * @return Total price.
     */
    double getOrderTotal();
}
