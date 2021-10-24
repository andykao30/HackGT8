package hackgt.pokemans;

import javafx.application.Application;
import java.util.ArrayList;
import java.util.Scanner;

public class PokemansDriver {

    public static void main(String[] args) {
        /*
        System.out.println("Pokeman: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayList<String> arr = PokemansQuery.search(input);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        */
        try {
            Application.launch(PokemansApp.class, args); // Launches the application
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
            System.err.println("If this is a DISPLAY problem, then your X server connection");
            System.err.println("has likely timed out. This can generally be fixed by logging");
            System.err.println("out and logging back in.");
            System.exit(1);
        } // try

    }
}
