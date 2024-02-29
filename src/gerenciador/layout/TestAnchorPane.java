package gerenciador.layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TestAnchorPane extends AnchorPane {
    public TestAnchorPane() {
        Quadrado quadrado1 = new Quadrado();
        setTopAnchor(quadrado1,10D);
        setLeftAnchor(quadrado1,10D);

        Quadrado quadrado2 = new Quadrado();
        setTopAnchor(quadrado2,10D);
        setRightAnchor(quadrado2,10D);

        Quadrado quadrado3 = new Quadrado();
        setBottomAnchor(quadrado3,10D);
        setLeftAnchor(quadrado3,10D);

        Quadrado quadrado4 = new Quadrado();
        setBottomAnchor(quadrado4,10D);
        setRightAnchor(quadrado4,10D);

        Quadrado quadrado5 = new Quadrado();

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        setTopAnchor(hBox,110d);
        setBottomAnchor(hBox,110d);
        setLeftAnchor(hBox,110d);
        setRightAnchor(hBox,110d);

        hBox.getChildren().add(quadrado5);
        getChildren().addAll(quadrado1,quadrado2,quadrado3,quadrado4,hBox);
    }
}
