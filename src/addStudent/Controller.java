package addStudent;

import entities.Student;
import helper.DefaultScene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import static helper.RootStage.rootStage;
import static studentsRecord.Controller.studentObservableList;
public class Controller {
    public Button backBtn;
    public TextField tfAddress;
    public TextField tfId;
    public TextField tfName;
    public TextField tfPhone;
    public Button saveBtn;

    public void save() throws IOException {
        String id = tfId.getText();
        String name = tfName.getText();
        String phone = tfPhone.getText();
        String address = tfAddress.getText();
        try{
            studentObservableList.add(new Student(id, name, phone, address));
        }catch(Exception e){
            System.out.println(e);
        }finally {
            goBack();
        }
    }
    public void goBack() throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("../menu/menu.fxml"));
        rootStage.setTitle("Menu");
        rootStage.setScene(new DefaultScene(p));
    }
}
