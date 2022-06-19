package com.example.javafxchat.client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextArea messageArea;
    @FXML
    private TextField messageField;

    public void clickSendButton(ActionEvent actionEvent) {
        String answer = userAnswer.getText();
        if (answer.isBlank()) {
            return;
        }
        Game.BullsAndCowsCount count = game.calculateBullsAndCows(answer);
        String text = String.format("%d. Введено число %s, количество быков %d, количество коров %d", ++step, answer, count.getBulls(), count.getCows());
        historyArea.appendText(text + "\n");
        userAnswer.clear();
        userAnswer.requestFocus();
    }
}