package hackgt.pokemans;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;


public class PokemansApp  extends Application {

    VBox root;
    PokemansPokedex pokedex;
    PokemansToolBar toolbar;

    public void init() {
        root = new VBox();
        pokedex = new PokemansPokedex("ditto");
        toolbar = new PokemansToolBar(pokedex);
        root.getChildren().addAll(toolbar, pokedex);
    }

    public void start(Stage stage) {
        Scene scene = new Scene(root);
        stage.setMaxWidth(1280); // Sets the max width
        stage.setMaxHeight(720); // Sets the max height
        stage.setTitle("Pokemans!"); // Sets title
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();

    }
}
