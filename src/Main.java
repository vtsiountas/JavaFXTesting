import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {

    private VBox vBox;
    private Scene scene;
    private Button button;
    private Spinner<Integer> spinner;
    private SpinnerValueFactory<Integer> spinnerValueFactory;
    @Override
    public void start(Stage primaryStage) throws Exception{

        vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        scene = new Scene(vBox, 300, 300);
        button = new Button("Go to 2nd Screen");

        button.setOnAction(e -> StartScene.display(primaryStage));

        spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 50, 0);
        spinner = new Spinner<>(spinnerValueFactory);

        vBox.getChildren().addAll(button, spinner);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Screen 1");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
