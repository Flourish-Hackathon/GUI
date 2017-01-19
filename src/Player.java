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

            deck.setId("p2deck");
            hand.setId("p2hand");
            stats.setId("p2stats");
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

            deck.setId("p1deck");
            hand.setId("p1hand");
            stats.setId("p1stats");
        }

        label1.setId("health");
        label2.setId("resources");
        return deckHandStats;
    }

    public HBox getField() {
        if (player == 2) {
            for (int i=maxField-1; i>=0; i--) {
                field.getChildren().add(fieldButtons[i]);
            }
            field.setId("p2field");
        }
        else {
            for (int i = 0; i < maxField; i++) {
                field.getChildren().add(fieldButtons[i]);
            }
            field.setId("p1field");
        }
        return field;
    }
}