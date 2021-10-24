package hackgt.pokemans;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Background;


public class PokemansApp  extends Application {

    VBox root;
    PokemansPokedex pokedex;
    PokemansToolBar toolbar;
    Image background;
    BackgroundImage backImage;
    Background back;

    public void init() {
        root = new VBox();
        pokedex = new PokemansPokedex("ditto");
        toolbar = new PokemansToolBar(pokedex);
        background = new Image("file:./pokemon_grass.png");
        backImage = new BackgroundImage(background, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        back = new Background(backImage);
        root.getChildren().addAll(toolbar, pokedex);
        root.setBackground(back);
    }

    public void start(Stage stage) {
        Scene scene = new Scene(root);
        stage.setMaxWidth(1280); // Sets the max width
        stage.setMaxHeight(720); // Sets the max height
        stage.setTitle("Pok\u00E9mon Database"); // Sets title
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
}
