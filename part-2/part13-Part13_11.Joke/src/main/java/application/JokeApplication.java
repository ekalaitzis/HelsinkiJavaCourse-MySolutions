package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button joke = new javafx.scene.control.Button("Joke");
        Button answer = new javafx.scene.control.Button("Answer");
        Button explaination = new javafx.scene.control.Button("Explanation");

        menu.getChildren().addAll(joke, answer, explaination);
        layout.setTop(menu);

        StackPane mainBody = createView("What do you call a bear with no teeth?");
        StackPane secondBody = createView("A gummy bear.");
        StackPane thirdBody = createView("gummy bear, duh");



        joke.setOnAction((event) -> layout.setCenter(mainBody));
        answer.setOnAction((event) -> layout.setCenter(secondBody));
        explaination.setOnAction((event) -> layout.setCenter(thirdBody));

        layout.setCenter(mainBody);

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();

    }
    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
}
