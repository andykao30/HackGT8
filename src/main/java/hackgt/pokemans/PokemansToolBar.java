package hackgt.pokemans;

import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class PokemansToolBar extends HBox {

    TextField search;
    Text text;
    Button update;
    PokemansPokedex poke;

    public PokemansToolBar(PokemansPokedex poke) {
        super();
        this.poke = poke;
        text = new Text("Search Pokemans: ");
        search = new TextField("ditto");
        createUpdate();
        this.getChildren().addAll(text, search, update);
        this.setAlignment(Pos.CENTER_LEFT);
        this.setPadding(new Insets(6));
    }

    private void createUpdate() {
        update = new Button("Search");
        EventHandler<ActionEvent> handle = e -> updateImage(search.getText());
//        EventHandler<ActionEvent> handle = e -> System.out.println("Hello");
        update.setOnAction(handle);
    }

    private void updateImage(String pokeman) {
        poke.updatePoke(pokeman);
    }
}
