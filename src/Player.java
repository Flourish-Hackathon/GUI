import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Player {
    private int player;
    private int maxHand = 10;
    private int maxField = 7;
    private Button deck;
    private Button handButtons[] = new Button[maxHand];
    private Button fieldButtons[] = new Button[maxField];
    private HBox deckHandStats = new HBox(15);
    private HBox hand = new HBox(3);
    private HBox field = new HBox(5);
    private VBox stats = new VBox();
    Label label1 = new Label("HEALTH: 100");
    Label label2 = new Label("RESOURCES: 100");

    public Player(int player) {
        this.player = player;
        deck = new Button();
        for (int i=0; i<maxHand; i++) {
            handButtons[i] = new Button();
        }
        for (int i=0; i<maxField; i++) {
            fieldButtons[i] = new Button();
        }

    }

    public HBox getDeckHandStats() {
        if (player == 2) {
            for (int i=maxHand-1; i>=0; i--) {
                hand.getChildren().add(handButtons[i]);
            }

            stats.getChildren().add(label1);
            stats.getChildren().add(label2);

            deckHandStats.getChildren().add(stats);
            deckHandStats.getChildren().add(hand);
            deckHandStats.getChildren().add(deck);
        }
        else {
            for (int i=0; i<maxHand; i++) {
                hand.getChildren().add(handButtons[i]);
            }

            stats.getChildren().add(label1);
            stats.getChildren().add(label2);

            deckHandStats.getChildren().add(deck);
            deckHandStats.getChildren().add(hand);
            deckHandStats.getChildren().add(stats);
        }


        return deckHandStats;
    }

    public HBox getField() {
        if (player == 2) {
            for (int i=maxField-1; i>=0; i--) {
                field.getChildren().add(fieldButtons[i]);
            }
        }
        else {
            for (int i = 0; i < maxField; i++) {
                field.getChildren().add(fieldButtons[i]);
            }
        }
        return field;
    }
}