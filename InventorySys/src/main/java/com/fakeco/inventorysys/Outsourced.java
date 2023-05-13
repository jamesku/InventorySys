package com.fakeco.inventorysys;

/**This class extends Part to provide some attributes specific to the InHouse class. Specifically, it adds
 * a String value that identifies the company that made the part.*/
public class Outsourced extends Part {
    private String companyName;
    /**A subclass of part for outsourced parts.  This adds the company name attribute.
     * @param max max
     * @param min min
     * @param companyName company name
     * @param id part id
     * @param name part name
     * @param price part price
     * @param stock inventory*/
    public Outsourced(int id, String name, double price, int stock, int min, int max, String companyName) {
        super(id, name, price, stock, min, max);
        this.companyName = companyName;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
