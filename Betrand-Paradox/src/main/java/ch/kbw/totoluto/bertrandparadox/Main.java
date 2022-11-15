package ch.kbw.totoluto.bertrandparadox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * @author totoluto (Dev alias)
 * @version 15.11.2022
 */

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainViewWithCanvas.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 600, 456);

        stage.setTitle("Bertrand-Paradoxon");
        stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("IconTemp.png"))));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}