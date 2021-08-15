import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class SampleController {
    @FXML private Button cmdSignIn;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        Stage stage = (Stage) cmdSignIn.getScene().getWindow();
        
        stage.close();
    }

}
