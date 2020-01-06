package de.pahl.bhsb.shop.order;

import java.util.HashMap;

import de.pahl.bhsb.shop.product.InterfaceProduct;

/**
 * Order.
 *
 * @author Pahl
 *
 */
public class Order implements InterfaceOrder {

    /**
     * Places after comma.
     */
    private static final int DECIMAL_PLACES = 100;

    /**
     * Order id.
     */
    private String orderId;

    /**
     * Product list in order.
     */
    private HashMap<String, InterfaceProduct> productList;

    /**
     * Construct.
     */
    public Order() {
        this.orderId = "";
        this.productList = new HashMap<String, InterfaceProduct>();
    }

    /**
     * Set order id.
     */
    @Override
    public InterfaceOrder setOrderId(final String id) {
        this.orderId = id;
        return this;
    }

    /**
     * Get order id.
     */
    @Override
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * Set products.
     */
    @Override
    public void setProductList(final InterfaceProduct... products) {
        for (InterfaceProduct p : products) {
            this.productList.put(p.getSku(), p);
        }
    }

    /**
     * Get order total.
     */
    @Override
    public double getOrderTotal() {
        double total = 0.0;
        for (String key : this.productList.keySet()) {
            InterfaceProduct p = this.productList.get(key);
            if (p != null) {
                total += p.getSinglePrice();
            }
        }
        return (double) Math.round(total * DECIMAL_PLACES) / DECIMAL_PLACES;
    }

}
