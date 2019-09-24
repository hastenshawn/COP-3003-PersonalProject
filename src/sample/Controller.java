package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.sql.SQLException;

public class Controller {

    @FXML
    TextField idSQL = new TextField();
    TextField nameSQL = new TextField();

    public void searchNow(ActionEvent actionEvent) throws SQLException {
        ProductManager pm = new ProductManager();

        System.out.println(idSQL.getText());
        System.out.println(nameSQL.getText());

        String idString = idSQL.getText();
        String nameString = nameSQL.getText();

        // Finally let's insert some data
        // Will use stringBuilder or similar in video to build/map this
        // Main point for both: USE PLACEHOLDERS
        String insertQuery = "INSERT INTO employee " +
                "(uid, name)" +
                " VALUES (?, ?)";
        String[] itemp = {idString, nameString};

        pm.insertProd(insertQuery, itemp);

        pm.selectAll();

        pm.closeCon();
    }
}
