import helper.DefaultScene;
import helper.RootStage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import static helper.RootStage.rootStage;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage = primaryStage;
        Parent p = FXMLLoader.load(getClass().getResource("menu/menu.fxml"));
        rootStage.setTitle("Menu");
        rootStage.setScene(new DefaultScene(p));
        rootStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
