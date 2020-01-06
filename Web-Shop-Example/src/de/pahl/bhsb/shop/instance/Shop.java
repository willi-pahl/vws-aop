package de.pahl.bhsb.shop.instance;

/**
 * Shop instance.
 *
 * @author pahl
 *
 */
public final class Shop {

    /**
     * Shop name.
     */
    private String name;

    /**
     * Shop address.
     */
    private Address address;

    /**
     * Shop main currency.
     */
    private String currency;

    /**
     * Allowed currencys.
     */
    private String[] allowedCurrencies;

    /**
     * Shop owner.
     */
    private String owner;

    /**
     * Private Construct.
     *
     * @param builder Shop builder class.
     */
    private Shop(final Builder builder) {
        this.name = builder.getName();
        this.address = builder.getAddress();
        this.currency = builder.getCurrency();
        this.allowedCurrencies = builder.getAllowedCurrencies();
        this.owner = builder.getOwner();
    }

    /**
     * Get shop name.
     *
     * @return Shop name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get shop address.
     *
     * @return Shop address.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Get shop main currency.
     *
     * @return Shop main currency.
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Get allowed currencies.
     *
     * @return Allowed currencies.
     */
    public String[] getAllowedCurrencies() {
        return allowedCurrencies;
    }

    /**
     * Get shop owner.
     *
     * @return Shop owner.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Builder class for shop instances.
     *
     * @author pahl
     *
     */
    public static class Builder {

        /**
         * Shop name.
         */
        private String name;

        /**
         * Shop address.
         */
        private Address address;

        /**
         * Shop main currency.
         */
        private String currency;

        /**
         * Allowed currencies.
         */
        private String[] allowedCurrencies;

        /**
         * Shop owner.
         */
        private String owner;

        /**
         * Construct.
         *
         * @param shopName Shop name.
         * @param shopOwner Shop owner.
         */
        public Builder(final String shopName, final String shopOwner) {
            this.name = shopName;
            this.owner = shopOwner;
        }

        /**
         * Get shop name.
         *
         * @return Shop name.
         */
        public String getName() {
            return name;
        }

        /**
         * Set shop name.
         *
         * @param shopName Shop name.
         *
         * @return Shop instance.
         */
        public Builder setName(final String shopName) {
            this.name = shopName;
            return this;
        }

        /**
         * Get shop address.
         *
         * @return Shop address.
         */
        public Address getAddress() {
            return address;
        }

        /**
         * Set shop address.
         *
         * @param shopAddress Shop address.
         *
         * @return Shop instance.
         */
        public Builder setAddress(final Address shopAddress) {
            this.address = shopAddress;
            return this;
        }

        /**
         * Get shop main currency.
         *
         * @return Shop main currency.
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Set shop main currency.
         *
         * @param shopCurrency Shop main currency.
         *
         * @return Shop instance.
         */
        public Builder setCurrency(final String shopCurrency) {
            this.currency = shopCurrency;
            return this;
        }

        /**
         * Get allowed currencies.
         *
         * @return Allowed currencies.
         */
        public String[] getAllowedCurrencies() {
            return allowedCurrencies;
        }

        /**
         * Set allowed currencies.
         *
         * @param currencies Allowed currencies.
         *
         * @return Shop instance.
         */
        public Builder setAllowedCurrencies(final String[] currencies) {
            this.allowedCurrencies = currencies;
            return this;
        }

        /**
         * Get shop owner.
         *
         * @return Shop owner.
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Set shop owner.
         *
         * @param shopOwner Shop owner.
         *
         * @return Shop instance.
         */
        public Builder setOwner(final String shopOwner) {
            this.owner = shopOwner;
            return this;
        }

        /**
         * Build a new shop.
         *
         * @return New shop.
         */
        public Shop build() {
            return new Shop(this);
        }

    }

}
