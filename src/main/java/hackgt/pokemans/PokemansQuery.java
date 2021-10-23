package hackgt.pokemans;

import java.util.ArrayList;
import java.net.URLEncoder;
import java.net.URL;
import java.io.InputStreamReader;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.net.MalformedURLException;
import java.io.IOException;


public class PokemansQuery {

    public static ArrayList<String> search(String pokeman) {
        String sURL = "https://pokeapi.co/api/v2/pokemon/" + pokeman;
        ArrayList<String> data = new ArrayList<>();
        try {
            URL url = new URL(sURL);
            InputStreamReader reader = new InputStreamReader(url.openStream());
            JsonElement je = JsonParser.parseReader(reader);
            JsonObject root = je.getAsJsonObject();
            JsonObject sprite = root.getAsJsonObject("sprites");
            JsonElement artwork = sprite.get("front_default");
//            System.out.println(artwork.getAsString());
            data.add(artwork.getAsString());

        } catch (MalformedURLException mue){
            System.out.println("Error: " + mue.getMessage());
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe.getMessage());
        }
        return data;
    } // search

} // PokemansQuery
