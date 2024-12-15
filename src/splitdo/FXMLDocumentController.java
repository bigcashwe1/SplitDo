/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package splitdo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField textField;

    private String[] splitWords;
    private int currentIndex = 0;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (splitWords == null || currentIndex >= splitWords.length) {
            String inputText = textField.getText().trim();
            splitWords = inputText.split("\\s+");
            currentIndex = 0;
        }

        if (currentIndex < splitWords.length) {
            label.setText(splitWords[currentIndex]);
            currentIndex++;
        } else {
            label.setText("No more words to display.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize with default values if needed
    }
}
