import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Scene2 {

    private VBox vBox;
    private Scene scene;
    private Button button;

    public Scene2(Stage stage) {
        display(stage);
    }


    public void display(Stage stage) {
        String original_title = stage.getTitle();
        Scene original_scene = stage.getScene();
        vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        scene = new Scene(vBox, 300, 300);
        button = new Button("Go Back");
        vBox.getChildren().addAll(button);
        button.setOnAction(e -> {
            stage.setScene(original_scene);
            stage.setTitle(original_title);
        });

        stage.setScene(scene);
        stage.setTitle("Screen 2");

    }

}
