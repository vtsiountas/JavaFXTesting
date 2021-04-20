import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Scene2 {


    public static void display(Stage stage) {
        String original_title = stage.getTitle();
        Scene original_scene = stage.getScene();
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, 300, 300);
        Button button = new Button("Go Back");
        vBox.getChildren().addAll(button);
        button.setOnAction(e -> {
            stage.setScene(original_scene);
            stage.setTitle(original_title);
        });

        stage.setScene(scene);
        stage.setTitle("Screen 2");

    }

}
