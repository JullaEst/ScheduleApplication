package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class EditAppointment {
    public void onEditStartDate(ActionEvent actionEvent) {
    }

    public void onEditEndDate(ActionEvent actionEvent) {
    }

    public void onEditStartTime(ActionEvent actionEvent) {
    }

    public void onEditEndTime(ActionEvent actionEvent) {
    }

    public void onEditCustomerID(ActionEvent actionEvent) {
    }

    public void onEditUserID(ActionEvent actionEvent) {
    }

    public void onSaveButton(ActionEvent actionEvent) {
    }

    public void onCancelButton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to ignore your changes?",
                ButtonType.OK,
                ButtonType.CANCEL);

        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                Parent editAppointment = null;

                try {
                    editAppointment  = FXMLLoader.load(getClass().getResource("/view/Appointments.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Scene partScene = new Scene(editAppointment);

                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                window.setScene(partScene);
                window.show();

            }

        });
    }
}
