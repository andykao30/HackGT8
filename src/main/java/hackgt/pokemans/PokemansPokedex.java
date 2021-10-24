package hackgt.pokemans;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import java.util.ArrayList;

public class PokemansPokedex extends HBox{

    Text pokeInfo;
    ImageView holder;
    Image sprite;
    ArrayList<String> base;

    public PokemansPokedex(String pokeman) {
        super();
        base = PokemansQuery.search(pokeman);
        holder = new ImageView();
        pokeInfo = new Text(base.get(1));
        updatePoke(pokeman);
        this.getChildren().addAll(holder, pokeInfo);
    }

    public void updatePoke(String pokemon) {
        base = PokemansQuery.search(pokemon);
        pokeInfo.setText(base.get(1));
        sprite = new Image(base.get(0));
        holder.setImage(sprite);
    }


}
