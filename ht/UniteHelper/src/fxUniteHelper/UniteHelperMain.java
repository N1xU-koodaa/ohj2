package fxUniteHelper;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author nikla
 * @version 12.2.2025
 *
 */
public class UniteHelperMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("UniteHelperGUIView.fxml"));
            final Pane root = ldr.load();
            //final UniteHelperGUIController unitehelperCtrl = (UniteHelperGUIController) ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("unitehelper.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("UniteHelper");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args Ei kaytossa
     */
    public static void main(String[] args) {
        launch(args);
    }
}