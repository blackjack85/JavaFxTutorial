package sample;

import javafx.scene.control.Button;

public class Controller {

    public Button button;

    public void handleButtonClick()
    {
        System.out.println("run some code that user can't see...000xxx");
        button.setText("stop touching me...x+2#");

    }
}
