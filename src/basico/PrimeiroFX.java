package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button buttonA = new Button("A");
        Button buttonB= new Button("B");
        Button buttonSair = new Button("Sair");
        Label label = new Label("Olá");

        buttonA.setOnAction((a) -> {
            label.setText("Debora Fedorenta");
        });
        buttonSair.setOnAction(status -> System.exit(0));


        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.getChildren().add(buttonA);
        vBox.getChildren().add(buttonB);
        vBox.getChildren().add(buttonSair);
        vBox.getChildren().add(label);

        Scene cena = new Scene(vBox,200,400);

        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
