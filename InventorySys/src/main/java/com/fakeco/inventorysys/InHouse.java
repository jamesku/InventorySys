package com.fakeco.inventorysys;

/**This class extends Part to provide some attributes specific to the InHouse class. Specifically, it adds
 * an int value that identifies the machine that made the part.*/
public class InHouse extends Part {
    private int machineId;
    /**A subclass of part for inhouse parts.  This adds the machineId attribute.
     * @param max max
     * @param min min
     * @param machineId machineId
     * @param id part id
     * @param name part name
     * @param price part price
     * @param stock inventory*/
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
        super(id, name, price, stock, min, max);
        this.machineId=machineId;
    }

    /**
     * Returns the machineId.
     * @return the machineId
     */
    public int getMachineId() {
        return machineId;
    }

    /**
     * Sets the machineID.
     * @param machineId the machineId to set
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
}
