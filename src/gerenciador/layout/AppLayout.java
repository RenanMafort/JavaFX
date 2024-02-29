package gerenciador.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new TestAnchorPane(),800,600);
        stage.setScene(scene);
        stage.setTitle("Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
