package de.pahl.bhsb.shop.instance;

/**
 * Address.
 *
 * @author pahl
 *
 */
public class Address {

    /**
     * Street.
     */
    private String street;

    /**
     * Postcode.
     */
    private String postcode;

    /**
     * Town.
     */
    private String town;

    /**
     * Street number.
     */
    private String streetNumber;

    /**
     * Country.
     */
    private String country;

    /**
     * Get street.
     *
     * @return Street.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Set street.
     *
     * @param str Street.
     */
    public void setStreet(final String str) {
        this.street = str;
    }

    /**
     * Get postcode.
     *
     * @return Postcode.
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Set postcode.
     *
     * @param pos Postcode.
     */
    public void setPostcode(final String pos) {
        this.postcode = pos;
    }

    /**
     * Get town.
     *
     * @return Town.
     */
    public String getTown() {
        return town;
    }

    /**
     * Set town.
     *
     * @param tow Town.
     */
    public void setTown(final String tow) {
        this.town = tow;
    }

    /**
     * Get street number.
     *
     * @return Street number.
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Set street number.
     *
     * @param strNum Street number.
     */
    public void setStreetNumber(final String strNum) {
        this.streetNumber = strNum;
    }

    /**
     * Get country.
     *
     * @return Country.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set country.
     *
     * @param cou Country.
     */
    public void setCountry(final String cou) {
        this.country = cou;
    }

}
