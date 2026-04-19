package hi.vidmot;

import hi.vinnsla.CurrencyConverter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CurrencyController {

    private CurrencyConverter converter;

    @FXML private TextField fxAmount;
    @FXML private ChoiceBox<String> fxCurrency;
    @FXML private Label fxResult;


    public void initialize() {
        // TODO: Create instance of CurrencyConverter
        converter = new CurrencyConverter();

        // TODO: initialize ChoiceBox with currency elements from CurrencyConverter
        fxCurrency.setItems(converter.getCurrencies());

        // TODO: make the first currency the current one in the GUI
        fxCurrency.setValue(converter.getCurrencies().getFirst());
        
    }

    @FXML
    private void handleConvert(ActionEvent event) {
        // TODO:  read input, call conversion, and display result
        if (fxAmount.getText().isEmpty()) {
            return;
        }
        fxResult.setText(converter.convertToISK (Double.parseDouble(fxAmount.getText()),
                fxCurrency.getValue())+"");
    }
}
