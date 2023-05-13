/**Maven framework for C482 PA submission.
 * @author James Kuhr*/
module com.fakeco.inventorysys {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.fakeco.inventorysys to javafx.fxml;
    exports com.fakeco.inventorysys;
}