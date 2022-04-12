package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class EditCustomer {
    public void onSaveButton(ActionEvent actionEvent) {
    }

    public void onCancelButton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to ignore your changes?",
                ButtonType.OK,
                ButtonType.CANCEL);

        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                Parent editCustomer = null;

                try {
                    editCustomer  = FXMLLoader.load(getClass().getResource("/view/CustomerScreen.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Scene partScene = new Scene(editCustomer);

                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                window.setScene(partScene);
                window.show();

            }

        });
    }

    public void onNameText(MouseEvent mouseEvent) {
    }

    public void onAddressText(MouseEvent mouseEvent) {
    }

    public void onCityText(MouseEvent mouseEvent) {
    }

    public void onCountryText(MouseEvent mouseEvent) {
    }

    public void onZipCodeText(MouseEvent mouseEvent) {
    }

    public void onPhoneNumber(MouseEvent mouseEvent) {
    }
}
