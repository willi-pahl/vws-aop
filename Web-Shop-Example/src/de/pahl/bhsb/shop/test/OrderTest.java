package de.pahl.bhsb.shop.test;

import de.pahl.bhsb.shop.order.Order;

/**
 * Test Order.
 *
 * @author Pahl
 *
 */
public final class OrderTest {

    /**
     * Private construct.
     */
    private OrderTest() {
        Order order = new Order();
        order.setOrderId("120").setProductList(ProductFactory.getProducts());
        System.out.println("orderid=" + order.getOrderId());
        System.out.println("total=" + order.getOrderTotal());
    }

    /**
     * Man methode.
     *
     * @param args Consoles parameters.
     */
    public static void main(final String[] args) {
        new OrderTest();
    }

}
