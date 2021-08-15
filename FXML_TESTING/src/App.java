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

        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));

        Scene scene = new Scene(root, 600, 424);
        scene.getStylesheets().add(App.class.getResource("example.css").toExternalForm());

        stage1.setTitle("WELCOME TO MY FXML TEST APP");
        stage1.setScene(scene);
        stage1.show();

    }
}

/* 
! WHAT DID WE LEARN:
    * App class handles running of program, setting "scene" and windows, and calling resources.
    * Use a controller class to handle events from FXML elements.
    * css for FXML is slightly limited in comparison to CSS for web dev.
*/