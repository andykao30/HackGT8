package hackgt.pokemans;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class PokemansPokedex extends HBox{

    Text pokeInfo;
    ImageView holder;
    Image sprite;
    ArrayList<String> base;

    public PokemansPokedex(String pokeman) {
        super();
        base = PokemansQuery.search(pokeman);
        holder = new ImageView();
        try {
            pokeInfo = new Text(base.get(1));
            pokeInfo.setTextAlignment(TextAlignment.CENTER);
            Color c = Color.rgb(0, 90, 0);
            pokeInfo.setFill(c);
            updatePoke(pokeman);
            this.getChildren().addAll(holder, pokeInfo);
            this.setAlignment(Pos.CENTER);
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Error: " + ioobe.getMessage());
            System.exit(1);
        }
    }

    public void updatePoke(String pokemon) {
        base = PokemansQuery.search(pokemon);
        pokeInfo.setText(base.get(1));
        sprite = new Image(base.get(0));
        holder.setImage(sprite);
    }


}
