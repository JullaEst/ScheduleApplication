package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.AppointmentsTable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Appointments implements Initializable {

    public TableColumn apptIdCol;
    public TableColumn titleCol;
    public TableColumn descriptionCol;
    public TableColumn locationCol;
    public TableColumn contactCol;
    public TableColumn apptTypeCol;
    public TableColumn dateCol;
    public TableColumn startTimeCol;
    public TableColumn endTimeCol;
    public TableColumn customerIdCol;
    public TableColumn userIdCol;

    public RadioButton weeklyView;
    public RadioButton monthlyView;

    public Button addButton;
    public Button editButton;
    public Button deleteButton;
    public Button exitButton;


    //list view reference
     @FXML private TableView<String> viewApptList;

    //create observable list
    ObservableList<String> viewList = FXCollections.observableArrayList("Customer", "Contact", "Appointment Type");

    public void onAddButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        Object scene = FXMLLoader.load(getClass().getResource("/view/AddAppointment.fxml"));
        stage.setScene(new Scene((Parent) scene));
        stage.show();
    }

    public void onEditButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        Object scene = FXMLLoader.load(getClass().getResource("/view/EditAppointment.fxml"));
        stage.setScene(new Scene((Parent) scene));
        stage.show();
    }

    public void onDeleteButton(ActionEvent actionEvent) {

        //how to delete an entry?
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Appointment Confirmation");
        alert.setHeaderText("Selected Appointment will be deleted");
        alert.setContentText("Would you like to delete this appointment?");
    }

    public void onExitButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        Object scene = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        stage.setScene(new Scene((Parent) scene));
        stage.show();
        }

    public void onWeeklyButton(ActionEvent actionEvent) {
    }

    public void onMonthlyViewButton(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*
        AppointmentsTable.setItems(CustomerTable.getAllParts()); //AppointmentsTable will view getAllParts list from Inventory

        PartsTable.setItems(Inventory.getAllParts()); //PartsTable will view getAllParts list from Inventory
        ProductsTable.setItems(Inventory.getAllProducts()); //ProductsTable will view getAllProducts list from Inventory
         */

        apptIdCol.setCellValueFactory(new PropertyValueFactory<>("appt id"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        apptTypeCol.setCellValueFactory(new PropertyValueFactory<>("appt type"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>(" date"));
        startTimeCol.setCellValueFactory(new PropertyValueFactory<>("start time"));
        endTimeCol.setCellValueFactory(new PropertyValueFactory<>("end time"));
        customerIdCol.setCellValueFactory(new PropertyValueFactory<>("customer id"));
        userIdCol.setCellValueFactory(new PropertyValueFactory<>("user id"));

    }
}
