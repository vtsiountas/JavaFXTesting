import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {

    private VBox vBox;
    private Scene scene;
    private Button button;
    private Label label;
    public void start(Stage primaryStage) throws Exception{

        vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        scene = new Scene(vBox, 300, 300);
        button = new Button("Go to 2nd Screen");
        vBox.setSpacing(15);

        button.setOnAction(e -> Scene2.display(primaryStage));

        label = new Label("Click me to go to Scene 2");

        vBox.getChildren().addAll(label, button);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Screen 1");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
