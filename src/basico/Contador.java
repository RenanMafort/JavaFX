package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class Contador extends Application {

    private int contador = 0;

    @Override
    public void start(Stage stage) throws Exception {
        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");
        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");
        Button buttonIncrement = new Button("+");
        buttonIncrement.getStyleClass().add("botoes");
        buttonIncrement.setOnAction(a -> {
            labelNumero.setText(Integer.toString(++contador));
        });
        Button buttonDecrement = new Button("-");
        buttonDecrement.getStyleClass().add("botoes");
        buttonDecrement.setOnAction(a -> {
            labelNumero.setText(Integer.toString(--contador));
        });

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(buttonDecrement);
        hBox.getChildren().add(buttonIncrement);

        VBox vBox = new VBox();
        vBox.getStyleClass().add("conteudo");
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(labelTitulo);
        vBox.getChildren().add(labelNumero);
        vBox.getChildren().add(hBox);

        String caminhoCss = Objects.requireNonNull(getClass().getResource("/basico/Contador.css")).toExternalForm();

        Scene cenaPrincipal = new Scene(vBox,400,400);
        cenaPrincipal.getStylesheets().add(caminhoCss);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
        stage.setScene(cenaPrincipal);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
