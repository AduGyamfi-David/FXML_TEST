import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override

    public void start(Stage stage1) throws Exception {
        // Parent root;
        // try {
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
        // } catch (Exception e) {
        //     //TODO: handle exception
        //     e.printStackTrace();
        // }

        Scene scene = new Scene(root, 600, 424);

        stage1.setTitle("WELCOME TO MY FXML TEST APP");
        stage1.setScene(scene);
        stage1.show();

    }
}
