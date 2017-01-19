import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private VBox playerPanes = new VBox(20);
    private VBox p1Layout = new VBox(20);
    private VBox p2Layout = new VBox(20);

    @Override
    public void start(Stage primaryStage) throws Exception {
        Player p1 = new Player(1);
        Player p2 = new Player(2);

        p2Layout.getChildren().add(p2.getDeckHandStats());
        p2Layout.getChildren().add(p2.getField());

        p1Layout.getChildren().add(p1.getField());
        p1Layout.getChildren().add(p1.getDeckHandStats());

        playerPanes.getChildren().add(p2Layout);
        playerPanes.getChildren().add(p1Layout);

        Scene scene = new Scene(playerPanes);
        primaryStage.setScene(scene);
        scene.getStylesheets().add("css/styles.css");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}