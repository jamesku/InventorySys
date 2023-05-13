package com.fakeco.inventorysys;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**This class manages the inventory of products and parts. It allows products and parts to be added
 * deleted, found, replaced, associated and disassociated and can return a full list of either set.*/
public class Inventory {
    /**Initialize lists of Parts*/
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();
    /**Initialize list of Products */
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();
    /** This adds a given part to the list of parts.
     * @param newPart the part to add*/
    public static void addPart(Part newPart){
        allParts.add(newPart);
        //trouble 1: filling test data
        System.out.println(newPart.getName());
    }
    /** This adds a given product to the list of parts.
     * @param newProduct the part to add*/
    public static void addProduct(Product newProduct){
        allProducts.add(newProduct);
    }
    /** This finds a given part in the list of parts based on an id number.
     * @param partId the part to add
     * @return p the found part*/
    public static Part lookupPart(int partId){
        for(Part p : allParts) {
            if (p.getId() == partId) {
                return p;
            }
        }
        return null;
    }
    /** This finds a given product in the list of parts based on an id number.
     * @param productId the part to add
     * @return p the found part*/
    public static Product lookupProduct(int productId){
        for(Product p : allProducts) {
            if (p.getId() == productId) {
                return p;
            }
        }
        return null;
    }

    /** This finds one or more parts in the list of parts based on a String.
     * @param partName the part to add
     * @return an ObservableList of namedParts of the found parts*/
    public static ObservableList<Part> lookupPart(String partName){
        ObservableList<Part> namedParts = FXCollections.observableArrayList();
        for (Part p: allParts ){
            if (p.getName().contains(partName)){
                namedParts.add(p);
            }
        }
        return namedParts;
    }

    /** This finds one or more products in the list of parts based on a String.
     * @param productName the part to add
     * @return an ObservableList of namedProducts of the found parts*/
    public static ObservableList<Product> lookupProduct(String productName){
        ObservableList<Product> namedProducts = FXCollections.observableArrayList();
        for (Product p: allProducts ){
            if (p.getName().contains(productName)){
                namedProducts.add(p);
            }
        }
        return namedProducts;
    }
/**This replaces a part in the Arraylist with another part.
 * @param index the index for the replacement
 * @param selectedPart the new part to be inserted
 * */
    public static void updatePart(int index, Part selectedPart){
        allParts.set(index, selectedPart);
    }
    /**This replaces a product in the Arraylist with another part.
     * @param index the index for the replacement
     * @param newProduct the new part to be inserted
     * */
    public static void updateProduct(int index, Product newProduct){
        allProducts.set(index, newProduct);
        }
    /**This deletes a part from the ObservableList.
     * @param selectedPart The part to delete.
     * @return A boolean about if the part is deleted.*/
    public static boolean deletePart(Part selectedPart){
        boolean remove = allParts.remove(selectedPart);
        return remove;
    }
    /**This deletes a product from the ObservableList.
     * @param selectedProduct The product to delete.
     * @return A boolean about if the product is deleted.*/
    public static boolean deleteProduct(Product selectedProduct){
        boolean remove = allProducts.remove(selectedProduct);
        return remove;
    }
/**This returns the complete list of parts.
 * @return allParts The complete list of parts.*/
    public static ObservableList<Part> getAllParts(){
        return allParts;
    }
    /**This returns the complete list of products.
     * @return allProducts The complete list of products.*/
    public static ObservableList<Product> getAllProducts(){
        return allProducts;
    }
}
