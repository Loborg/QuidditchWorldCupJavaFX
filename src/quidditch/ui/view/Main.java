package quidditch.ui.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class Main extends Application {
    Parent root;
    Scene scene;
    
    @Override
    public void start(Stage stage) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/quidditch/ui/fxml/QuiddichWQJavaFX.fxml"));
        scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
