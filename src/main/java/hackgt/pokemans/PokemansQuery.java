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

            // Typing for the specific pokemon (comes in an array)
            String pokemonType = pokeman + "'s type is ";
            JsonArray types = root.getAsJsonArray("types");
            int numTypes = types.size();
            for (int i = 0; i < numTypes; i++) {
                // Obtain the JsonObject of each element in the array
                JsonObject block = types.get(i).getAsJsonObject();
                // Looks for the JsonObject associatede with "type"
                JsonObject type = block.getAsJsonObject("type");
                // Obtains the element associated with that JsonObject
                JsonElement typing = type.get("name");
//                System.out.println(x.getAsString());
                if (i != 0) {
                    pokemonType += " and " + typing.getAsString();
                } else {
                    pokemonType += typing.getAsString();
                }
            } // for
            data.add(pokemonType);

        } catch (MalformedURLException mue){
            System.out.println("Error: " + mue.getMessage());
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe.getMessage());
        }
        return data;
    } // search

} // PokemansQuery
