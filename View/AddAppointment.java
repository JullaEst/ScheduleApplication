package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddAppointment implements Initializable {


    //text fields
    @FXML
    private TextField addApptID;
    @FXML
    private TextField addTitle;
    @FXML
    private TextField addDescription;
    @FXML
    private TextField addLocation;
    @FXML
    private TextField addContact;
    @FXML
    private TextField addApptType;
    @FXML
    private TextField addStartTime;
    @FXML
    private TextField AddEndTime;

    //date picker
    @FXML
    private DatePicker startDate;
    @FXML
    private DatePicker endDate;

    //combo box
    @FXML
    private ComboBox<?> customerID;
    @FXML
    private ComboBox<?> userID;

    //buttons
    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;

    public void onAddStartDate(ActionEvent actionEvent) {
    }

    public void onAddEndDate(ActionEvent actionEvent) {
    }

    public void onAddStartTime(ActionEvent actionEvent) {
    }

    public void onAddEndTime(ActionEvent actionEvent) {
    }

    public void onAddCustomerID(ActionEvent actionEvent) {
    }

    public void onAddUserID(ActionEvent actionEvent) {
    }

    public void onSaveButton(ActionEvent event) throws IOException {
        //int apptId = Appointments.getNextID();
        String title = addTitle.getText();
        String description = addDescription.getText();
        String location = addLocation.getText();
        String contact = addContact.getText();
        String apptType = addApptType.getText();
       /*
        how to do start date and end date?
        is time a string or an int?
        is customer id and user id a string?
        */
    }

    public void onCancelButton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to ignore your changes?",
                ButtonType.OK,
                ButtonType.CANCEL);

        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                Parent addAppointment = null;

                try {
                   addAppointment  = FXMLLoader.load(getClass().getResource("/view/Appointments.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Scene partScene = new Scene(addAppointment);

                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                window.setScene(partScene);
                window.show();

            }

        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


