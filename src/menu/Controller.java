package menu;

import entities.Student;
import helper.DefaultScene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

import static helper.RootStage.rootStage;
import static studentsRecord.Controller.studentObservableList;
public class Controller {
    public Button addBtn;
    public Button recordsBtn;
    public Button saveBtn;
    public Button exitBtn;

    public void navigateAdd () throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("../addStudent/addStudent.fxml"));
        rootStage.setTitle("Add New Student");
        rootStage.setScene(new DefaultScene(p));
    }
    public void navigateRecords () throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("../studentsRecord/studentsRecord.fxml"));
        rootStage.setTitle("Students Record");
        rootStage.setScene(new DefaultScene(p));
    }
    public void saveToTxt (){
        Path path = Paths.get("C:\\Users\\Default\\Downloads\\records.txt");
        String txt ="";
        for (Student s: studentObservableList) {
            ArrayList<String> info = new ArrayList<String>();
            txt = s.getId() + "," + s.getName() +"," +s.getPhone()+"," + s.getAddress()+"\n";
        }
        try{
            Files.write(path, Collections.singleton(txt), StandardCharsets.UTF_8);
        }catch(Exception e){}

    }
    public void exitProgram(){
        System.exit(0);
    }

}
