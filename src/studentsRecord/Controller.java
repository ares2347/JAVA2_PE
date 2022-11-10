package studentsRecord;

import entities.Student;
import helper.DefaultScene;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static helper.RootStage.rootStage;

public class Controller implements Initializable {
    public Button backBtn;
    public TableView tbvRecords;
    public TableColumn<Student, String> tdId;
    public TableColumn<Student, String> tdName;
    public TableColumn<Student, String> tdAddress;
    public TableColumn<Student, String> tdPhone;

    public static ObservableList<Student> studentObservableList = FXCollections.observableArrayList();
    public void goBack(ActionEvent actionEvent) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("../menu/menu.fxml"));
        rootStage.setTitle("Menu");
        rootStage.setScene(new DefaultScene(p));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tdId.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
        tdName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        tdAddress.setCellValueFactory(new PropertyValueFactory<Student, String>("address"));
        tdPhone.setCellValueFactory(new PropertyValueFactory<Student, String>("phone"));
        tbvRecords.setItems(studentObservableList);
    }
}
