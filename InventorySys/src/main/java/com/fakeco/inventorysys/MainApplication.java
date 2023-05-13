package com.fakeco.inventorysys;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**The main application that runs the program. Javadocs found in InventorySys/Javadocs*/
public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("mainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
        addTestData();
    }

    /**This is private test data.  There was an error in my program here as I created one newList variable
     * and populated it throughout all the product objects.
     * <p><b>RUNTIME ERROR (but really a LOGICAL ERROR): When I ran the program, whenever I associated
     * a part with any of the products, it appeared in all of the products.  Apparently, the relationship
     * caused by the use of the same ObservableList persisted.  I tracked the error all the way back to
     * this data input and corrected it by making distinctly separate lists for each of the test product
     * objects. </b></p>*/
    private void addTestData(){
        InHouse Part1 = new InHouse(1, "thing", 10.99, 2, 1, 20,1001);
        Inventory.addPart(Part1);
        InHouse Part2 = new InHouse(2, "whatza", 1.99, 5, 3, 26,1002);
        Inventory.addPart(Part2);
        InHouse Part3 = new InHouse(3, "shugo", 3.39, 20, 10, 26,1003);
        Inventory.addPart(Part3);
        InHouse Part4 = new InHouse(4, "heezan", 5.29, 100, 100, 200,1004);
        Inventory.addPart(Part4);
        Outsourced Part5 = new Outsourced(5, "thing", 10.99, 2, 1, 20,"Texaco");
        Inventory.addPart(Part5);
        Outsourced Part6 = new Outsourced(6, "whatza", 1.99, 5, 3, 26,"shell");
        Inventory.addPart(Part6);
        Outsourced Part7 = new Outsourced(7, "shugo", 3.39, 20, 10, 26,"chevron");
        Inventory.addPart(Part7);
        Outsourced Part8 = new Outsourced(8, "heezan", 5.29, 100, 100, 200,"bigchair");
        Inventory.addPart(Part8);

        ObservableList<Part> newList10 =  FXCollections.observableArrayList();
        ObservableList<Part> newList1 =  FXCollections.observableArrayList();
        ObservableList<Part> newList2 =  FXCollections.observableArrayList();
        ObservableList<Part> newList3 =  FXCollections.observableArrayList();
        Product Product1 = new Product(newList10, 2, "thingProduct", 10.99, 2, 1, 20);
        Inventory.addProduct(Product1);
        Product Product2 = new Product(newList1, 3, "whatzaProduct", 1.99, 5, 3, 26);
        Inventory.addProduct(Product2);
        Product Product3 = new Product(newList2,4, "shugoProduct", 3.39, 20, 10, 26);
        Inventory.addProduct(Product3);
        Product Product4 = new Product(newList3,5, "heezanProduct", 5.29, 100, 100, 200);
        Inventory.addProduct(Product4);
    }

/**Launch the application
 * @param args main args */
    public static void main(String[] args) {
        launch();
    }
}