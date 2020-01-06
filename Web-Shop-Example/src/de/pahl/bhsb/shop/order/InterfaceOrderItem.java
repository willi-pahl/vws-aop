package de.pahl.bhsb.shop.order;

public interface InterfaceOrderItem {

    /**
     * Define the single price for product.
     *
     * @param singlePrice Single item Price.
     *
     * @return This oreder item.
     */
    OrderItem definiePrice(double singlePrice);

    /**
     * Set the quantity for item.
     *
     * @param quantity
     *
     * @return This order item.
     */
    OrderItem definieQuantity(int quantity);

    /**
     * Get price for this item.
     *
     * @return Price for this item.
     */
    double getItemPrice();
}
