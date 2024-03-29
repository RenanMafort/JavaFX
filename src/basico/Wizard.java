package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
    private Stage janela;
    private Scene passo1;
    private Scene passo2;
    private Scene passo3;
    private Scene passo4;

    @Override
    public void start(Stage stage) throws Exception {
        janela = stage;
        criarPasso1();
        criarPasso2();

        janela.setScene(passo1);
        janela.setTitle("Wizard");
        janela.show();
    }

    private void criarPasso1(){
        Button proximoPasso = new Button("Ir p/ Passo 2 >>");
        proximoPasso.setOnAction(e -> {
            janela.setScene(passo2);
        });
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(proximoPasso);

        passo1 = new Scene(box,400,400);
    }

    private void criarPasso2(){
        Button passoAnterior = new Button("<< Ir p/ Passo 1");
        Button proximoPasso = new Button("Ir p/ Passo 3>>");
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(passoAnterior);
        box.getChildren().add(proximoPasso);

        passo2 = new Scene(box,400,400);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
