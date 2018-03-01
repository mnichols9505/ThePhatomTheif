package edu.neumont.csc150.Screen;

import edu.neumont.csc150.Character.CharacterMove;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PickYourPoison extends Application{

    static Stage levelPick = new Stage();
    MainGameS1 mg = new MainGameS1();

    public Boolean poison;
    timer dif = new timer();


    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getClassLoader().getResource("fxml/PickLevel.fxml"));

        Scene scene = new Scene(root);

        levelPick = stage;

        levelPick.setScene(scene);
        levelPick.setTitle("The Phantom Thief");
        levelPick.getIcons().add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Emoji_u1f319.svg/2000px-Emoji_u1f319.svg.png"));
        levelPick.show();

    }

    @FXML
    Button gameButton;
    @FXML
    Button gameButton1;

    public void gameClick(MouseEvent event) throws Exception {

        Stage stage = (Stage) gameButton.getScene().getWindow();
        CountDown easy = new CountDown();
        easy.setPoison(true);
        stage.close();
        MainGameS1 game= new MainGameS1();
        game.start(MainGameS1.Gamestage);

        mg.doTime();

    }

    public void gameClickHard(MouseEvent event) throws Exception {
        dif.setBoolean(false);

        Stage stage = (Stage) gameButton.getScene().getWindow();
        CountDown hard = new CountDown();
        hard.setPoison(false);
        stage.close();
        MainGameS1 game= new MainGameS1();
        game.start(MainGameS1.Gamestage);

        mg.doHardTime();
    }
}
