package com.champlain.oop2assignment3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    @FXML
    private TextArea aHandTextArea;

    @FXML
    private ChoiceBox<String> aSortStrategyChoiceBox;

    @FXML
    private ChoiceBox<String> aScoreStrategyChoiceBox;

    @FXML
    private Label aScoreLabel;

    private final Deck aDeck = new Deck();

    private final Hand aHand = new Hand();

    public void initialize() {
        this.displayCardCollections();
        this.aSortStrategyChoiceBox.getItems().addAll("Rank First", "Suit First");
        this.aScoreStrategyChoiceBox.getItems().addAll("Simple Count", "Number Of Aces");
    }

    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayCardCollections();
    }

    @FXML
    protected void onSortButtonClick() {
        String choice = this.aSortStrategyChoiceBox.getValue();
        if (choice == null) {
            Alert selectionErrorAlert = new Alert(Alert.AlertType.ERROR, "Please choose a sorting strategy first.");
            selectionErrorAlert.showAndWait();
        } else {
            switch (choice) {
                case "Rank First":
                    // TODO: Replace the following line of code.
                    this.aDeckTextArea.setText("This does not sort by rank first yet.");
                    break;
                case "Suit First":
                    // TODO: Replace the following line of code.
                    this.aDeckTextArea.setText("This does not sort by suit first yet.");
                    break;
                default:
                    this.aDeckTextArea.setText("This should not happen! You messed up.");
                    break;
            }
        }
    }

    @FXML
    protected void onScoreButtonClick() {
        String choice = this.aScoreStrategyChoiceBox.getValue();
        if (choice == null) {
            Alert selectionErrorAlert = new Alert(Alert.AlertType.ERROR, "Please choose a scoring strategy first.");
            selectionErrorAlert.showAndWait();
        } else {
            switch (choice) {
                case "Simple Count":
                    // TODO: Replace the following line of code.
                    this.aScoreLabel.setText("Simple count...");
                    break;
                case "Number Of Aces":
                    // TODO: Replace the following line of code.
                    this.aScoreLabel.setText("Number of aces...");
                    break;
                default:
                    this.aScoreLabel.setText("This should not happen! You messed up.");
                    break;
            }
        }
    }

    @FXML
    protected void onDrawButtonClick() {
        if (!this.aDeck.isEmpty()) {
            this.aHand.addCard(this.aDeck.draw());
        } else {
            Alert selectionErrorAlert = new Alert(Alert.AlertType.INFORMATION, "There are no more cards in the deck.");
            selectionErrorAlert.showAndWait();
        }
        this.displayCardCollections();
    }

    private void displayCardCollections() {
        this.aDeckTextArea.setText(this.aDeck.toString());
        this.aHandTextArea.setText(this.aHand.toString());
    }
}