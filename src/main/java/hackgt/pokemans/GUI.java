package hackgt.pokemans;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class GUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent r1 = FXMLLoader.load(getClass().getResource("buttons.fxml"));
        Stage s1 = new Stage();
        // Group r1 = new Group();
        Scene sc1 = new Scene(r1);

        s1.setScene(new Scene(r1));
        s1.show();
        s1.setTitle("Pok\u00E9mon Database");

        // Image appIcon = new Image();
        // s1.getIcons().add(appIcon);

        s1.setWidth(800);
        s1.setHeight(500);
        s1.setResizable(true);

        Text t1 = new Text();
        t1.setFont(Font.font("Arial", 50));
        t1.setText(" Name:");
        t1.setX(100);
        t1.setY(100);


    }
}