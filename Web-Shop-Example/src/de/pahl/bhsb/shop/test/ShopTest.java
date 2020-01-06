package de.pahl.bhsb.shop.test;

import de.pahl.bhsb.shop.instance.Address;
import de.pahl.bhsb.shop.instance.Shop;

/**
 * Testbad for shops.
 *
 * @author pahl
 *
 */
public final class ShopTest {

    /**
     * Construct.
     */
    private ShopTest() {
        Address address = new Address();
        address.setStreet("Lindenallee");
        address.setTown("Temmen");
        address.setStreetNumber("9A");
        address.setPostcode("17268");
        address.setCountry("DE");

        Shop shop = new Shop.Builder("Test Shop", "Wilfried Pahl")
                .setAddress(address)
                .setCurrency("EURO")
                .setAllowedCurrencies(new String[]{"EUR", "USD", "RUB"})
                .build();

        System.out.println("Shop urrency is : " + shop.getCurrency());
        System.out.println("  Shop owner is : " + shop.getOwner());
        System.out.println("Shop address is : "
        + shop.getAddress().getPostcode() + " " + shop.getAddress().getTown()
        + ", " + shop.getAddress().getStreet() + " "
        + shop.getAddress().getStreetNumber());

        System.out.println("Allowed currency");
        for (String ac : shop.getAllowedCurrencies()) {
            System.out.println(ac);
        }
    }

    /**
     * Main method.
     *
     * @param args Consoles parameters.
     */
    public static void main(final String[] args) {
        new ShopTest();
    }

}
