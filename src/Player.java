import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Player {
    private int maxHand = 10;
    private int maxField = 7;
    private Button deck;
    private Button handButtons[] = new Button[maxHand];
    private Button fieldButtons[] = new Button[maxField];
    private HBox deckHandStats = new HBox(15);
    private HBox hand = new HBox(3);
    private HBox field = new HBox(5);
    private VBox stats = new VBox();

    public Player() {
        deck = new Button();
        for (int i=0; i<maxHand; i++) {
            handButtons[i] = new Button();
        }
        for (int i=0; i<maxField; i++) {
            fieldButtons[i] = new Button();
        }
        initializeHand();
        initializeStats();
        initializeField();
    }

    public HBox getDeckHandStats() {
        deckHandStats.getChildren().add(deck);
        deckHandStats.getChildren().add(hand);
        deckHandStats.getChildren().add(stats);
        return deckHandStats;
    }

    public HBox getField() {
        return field;
    }

    private void initializeHand() {
        for (int i=0; i<maxHand; i++) {
            hand.getChildren().add(handButtons[i]);
        }
    }

    private void initializeStats() {

    }

    private void initializeField() {
        for (int i=0; i<maxField; i++) {
            field.getChildren().add(fieldButtons[i]);
        }
    }
}