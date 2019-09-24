package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import sample.Controller;

import java.io.IOException;
import java.sql.SQLException;

public class Main extends Application {

    public static void main(Stage primaryStage,String[] args) throws IOException, SQLException {
        ProductManager pm = new ProductManager();
        pm.selectAll();

        // Finally let's insert some data
        // Will use stringBuilder or similar in video to build/map this
        // Main point for both: USE PLACEHOLDERS
        /*String insertQuery = "INSERT INTO employee " +
                "(uid, name)" +
                " VALUES (?, ?)";
        String[] itemp = {"5854", "New Value"};

        pm.insertProd(insertQuery, itemp);
        pm.selectAll();


        // And close our connection at end*/

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("iwantdie.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root, 650, 350));
        stage.show();

        stage.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            if(key.getCode()== KeyCode.ENTER) {
                System.out.println("You pressed enter");
            }
        });
    }
}