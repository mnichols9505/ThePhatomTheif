package edu.neumont.csc150.Screen;

import edu.neumont.csc150.Character.CharacterMove;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PickYourPoison extends Application{
    private Label label;
    static Stage levelPick = new Stage();
    static Stage Timer = new Stage();
    StartCountDown s = new StartCountDown();
    CountDown countDown = new CountDown();




    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(this.getClass().getClassLoader().getResource("fxml/PickLevel.fxml"));
        Group rootTime = new Group();
        Scene scene = new Scene(root);

        levelPick = stage;

        //Pick Difficulty
        levelPick.setScene(scene);
        levelPick.setTitle("The Phantom Thief");
        levelPick.getIcons().add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Emoji_u1f319.svg/2000px-Emoji_u1f319.svg.png"));
        levelPick.show();

        label = new Label();
        label.setTextFill(Color.WHITESMOKE);
        label.setFont(Font.font(22));

        Timer = stage;
        HBox hbox = new HBox(5);
        hbox.getChildren().add(label);
        hbox.setLayoutX(48);

        rootTime.getChildren().add(hbox);
    }

    @FXML
    Button gameButton;
    @FXML
    Button gameButton1;

    public void gameClick(MouseEvent event) throws Exception {
        MainGameS1 game= new MainGameS1(countDown);
        countDown.doTime();
        Stage stage = (Stage) gameButton.getScene().getWindow();
        stage.close();

        game.start(MainGameS1.Gamestage);
        s.start(StartCountDown.secondStage3);




    }

    public void gameClickHard(MouseEvent event) throws Exception {
        countDown.doHardTime();
        Stage stage = (Stage) gameButton.getScene().getWindow();
        stage.close();
        MainGameS1 game= new MainGameS1(countDown);
        game.start(MainGameS1.Gamestage);
        s.start(StartCountDown.secondStage3);
    }
}
