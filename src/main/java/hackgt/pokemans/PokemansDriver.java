package hackgt.pokemans;

import java.util.ArrayList;
import java.util.Scanner;

public class PokemansDriver {

    public static void main(String[] args) {
        System.out.println("Pokeman: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayList<String> arr = PokemansQuery.search(input);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
