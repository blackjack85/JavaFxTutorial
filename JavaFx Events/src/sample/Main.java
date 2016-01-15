package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button button1;
    Button button2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = new GridPane();
        root.setPadding(new Insets(25, 25, 25, 25));
        primaryStage.setTitle("Hello World");


        button1 = new Button("Click me");
        button2 = new Button("Stop Touching me...");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(button1);
        hbBtn.getChildren().add(button2);

        root.getChildren().add(hbBtn);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("I Like That.. do it again...");
            }
        });

        button2.setOnAction(event -> System.out.println("don't do that..."));

//        button1.setOnAction(e -> {
//            System.out.println("don't do that");
//        });

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
