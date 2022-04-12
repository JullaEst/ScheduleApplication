package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class CustomerScreen {
    public TableColumn custTableName;

    public void zipText(ActionEvent actionEvent) {
    }

    public void onAddButton(ActionEvent actionEvent) {
    }

    public void onEditButton(ActionEvent event) throws IOException {

            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            Object scene = FXMLLoader.load(getClass().getResource("/view/EditCustomer.fxml"));
            stage.setScene(new Scene((Parent) scene));
            stage.show();
        }



    public void onDeleteButton(ActionEvent actionEvent) {
    }

    public void onExitButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        Object scene = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        stage.setScene(new Scene((Parent) scene));
        stage.show();
    }
}
