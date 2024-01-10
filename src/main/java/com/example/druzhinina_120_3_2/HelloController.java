package com.example.druzhinina_120_3_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.Flow;

public class HelloController implements Initializable{
    @FXML
    private Label welcomeText;
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    @FXML
    Button nine;
    @FXML
    Button ten;
    @FXML
    Button eleven;
    @FXML
    Button twelve;
    @FXML
    Button thirteen;
    @FXML
    Button fourteen;
    @FXML
    Button fifteen;
    @FXML
    Button sixteen;
    @FXML
    Button newGame;
    @FXML
    FlowPane game;
    String victory = "no";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        game.setDisable(true);
    }
    @FXML
    protected void trueResult1(String oneString, String twoString, String threeString, String fourString, String fiveString, String sixString, String sevenString, String eightString, String nineString, String tenString, String elevenString, String twelveString, String thirteenString, String fourteenString, String fifteenString) {
        if (!Objects.equals(oneString, "") && !Objects.equals(twoString, "") && !Objects.equals(threeString, "") && !Objects.equals(fourString, "") && !Objects.equals(fiveString, "") && !Objects.equals(sixString, "") && !Objects.equals(sevenString, "") && !Objects.equals(eightString, "") && !Objects.equals(nineString, "") && !Objects.equals(tenString, "") && !Objects.equals(elevenString, "") && !Objects.equals(twelveString, "") && !Objects.equals(thirteenString, "") && !Objects.equals(fourteenString, "") && !Objects.equals(fifteenString, "")) {
            victory = Random.trueResult(oneString, twoString, threeString, fourString, fiveString, sixString, sevenString, eightString, nineString, tenString, elevenString, twelveString, thirteenString, fourteenString, fifteenString);
        }
        if (Objects.equals(victory, "99")) {
            welcomeText.setText("Victory");
            game.setDisable(true);
        }
    }

    @FXML
    protected void newGameClick(ActionEvent event) {
        game.setDisable(false);
        one.setText(String.valueOf(0));
        two.setText(String.valueOf(0));
        three.setText(String.valueOf(0));
        four.setText(String.valueOf(0));
        five.setText(String.valueOf(0));
        six.setText(String.valueOf(0));
        seven.setText(String.valueOf(0));
        eight.setText(String.valueOf(0));
        nine.setText(String.valueOf(0));
        ten.setText(String.valueOf(0));
        eleven.setText(String.valueOf(0));
        twelve.setText(String.valueOf(0));
        thirteen.setText(String.valueOf(0));
        fourteen.setText(String.valueOf(0));
        fifteen.setText(String.valueOf(0));
        one.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        two.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        three.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        four.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        five.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        six.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        seven.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        eight.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        nine.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        ten.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        eleven.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        twelve.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        thirteen.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        fourteen.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        fifteen.setText(Random.ran(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText()));
        sixteen.setText("");
        welcomeText.setText("");
    }
    @FXML
    protected void oneClick(ActionEvent event) {
        if (Objects.equals(two.getText(), "")) {
            two.setText(one.getText());
            one.setText("");
        } else if (Objects.equals(five.getText(), "")) {
            five.setText(one.getText());
            one.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void twoClick(ActionEvent event) {
        if (Objects.equals(three.getText(), "")) {
            three.setText(two.getText());
            two.setText("");
        } else if (Objects.equals(one.getText(), "")) {
            one.setText(two.getText());
            two.setText("");
        } else if (Objects.equals(six.getText(), "")) {
            six.setText(two.getText());
            two.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void threeClick(ActionEvent event) {
        if (Objects.equals(four.getText(), "")) {
            four.setText(three.getText());
            three.setText("");
        } else if (Objects.equals(seven.getText(), "")) {
            seven.setText(three.getText());
            three.setText("");
        } else if (Objects.equals(two.getText(), "")) {
            two.setText(three.getText());
            three.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void fourClick(ActionEvent event) {
        if (Objects.equals(three.getText(), "")) {
            three.setText(four.getText());
            four.setText("");
        } else if (Objects.equals(eight.getText(), "")) {
            eight.setText(four.getText());
            four.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void fiveClick(ActionEvent event) {
        if (Objects.equals(one.getText(), "")) {
            one.setText(five.getText());
            five.setText("");
        } else if (Objects.equals(six.getText(), "")) {
            six.setText(five.getText());
            five.setText("");
        } else if (Objects.equals(nine.getText(), "")) {
            nine.setText(five.getText());
            five.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void sixeClick(ActionEvent event) {
        if (Objects.equals(five.getText(), "")) {
            five.setText(six.getText());
            six.setText("");
        } else if (Objects.equals(two.getText(), "")) {
            two.setText(six.getText());
            six.setText("");
        } else if (Objects.equals(seven.getText(), "")) {
            seven.setText(six.getText());
            six.setText("");
        }
        else if (Objects.equals(ten.getText(), "")) {
            ten.setText(six.getText());
            six.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void sevenClick(ActionEvent event) {
        if (Objects.equals(three.getText(), "")) {
            three.setText(seven.getText());
            seven.setText("");
        } else if (Objects.equals(six.getText(), "")) {
            six.setText(seven.getText());
            seven.setText("");
        } else if (Objects.equals(eleven.getText(), "")) {
            eleven.setText(seven.getText());
            seven.setText("");
        }
        else if (Objects.equals(eight.getText(), "")) {
            eight.setText(seven.getText());
            seven.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void eightClick(ActionEvent event) {
        if (Objects.equals(four.getText(), "")) {
            four.setText(eight.getText());
            eight.setText("");
        } else if (Objects.equals(twelve.getText(), "")) {
            twelve.setText(eight.getText());
            eight.setText("");
        } else if (Objects.equals(seven.getText(), "")) {
            seven.setText(eight.getText());
            eight.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void nineClick(ActionEvent event) {
        if (Objects.equals(five.getText(), "")) {
            five.setText(nine.getText());
            nine.setText("");
        } else if (Objects.equals(ten.getText(), "")) {
            ten.setText(nine.getText());
            nine.setText("");
        } else if (Objects.equals(thirteen.getText(), "")) {
            thirteen.setText(nine.getText());
            nine.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void tenClick(ActionEvent event) {
        if (Objects.equals(six.getText(), "")) {
            six.setText(ten.getText());
            ten.setText("");
        } else if (Objects.equals(eleven.getText(), "")) {
            eleven.setText(ten.getText());
            ten.setText("");
        } else if (Objects.equals(fourteen.getText(), "")) {
            fourteen.setText(ten.getText());
            ten.setText("");
        }
        else if (Objects.equals(nine.getText(), "")) {
            nine.setText(ten.getText());
            ten.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void elevenClick(ActionEvent event) {
        if (Objects.equals(seven.getText(), "")) {
            seven.setText(eleven.getText());
            eleven.setText("");
        } else if (Objects.equals(twelve.getText(), "")) {
            twelve.setText(eleven.getText());
            eleven.setText("");
        } else if (Objects.equals(ten.getText(), "")) {
            ten.setText(eleven.getText());
            eleven.setText("");
        }
        else if (Objects.equals(fifteen.getText(), "")) {
            fifteen.setText(eleven.getText());
            eleven.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void twelveClick(ActionEvent event) {
        if (Objects.equals(sixteen.getText(), "")) {
            sixteen.setText(twelve.getText());
            twelve.setText("");
        } else if (Objects.equals(eight.getText(), "")) {
            eight.setText(twelve.getText());
            twelve.setText("");
        } else if (Objects.equals(eleven.getText(), "")) {
            eleven.setText(twelve.getText());
            twelve.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void thirteenClick(ActionEvent event) {
        if (Objects.equals(fourteen.getText(), "")) {
            fourteen.setText(thirteen.getText());
            thirteen.setText("");
        } else if (Objects.equals(nine.getText(), "")) {
            nine.setText(thirteen.getText());
            thirteen.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void fourteenClick(ActionEvent event) {
        if (Objects.equals(thirteen.getText(), "")) {
            thirteen.setText(fourteen.getText());
            fourteen.setText("");
        } else if (Objects.equals(fifteen.getText(), "")) {
            fifteen.setText(fourteen.getText());
            fourteen.setText("");
        } else if (Objects.equals(ten.getText(), "")) {
            ten.setText(fourteen.getText());
            fourteen.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void fiveteenClick(ActionEvent event) {
        if (Objects.equals(fourteen.getText(), "")) {
            fourteen.setText(fifteen.getText());
            fifteen.setText("");
        } else if (Objects.equals(eleven.getText(), "")) {
            eleven.setText(fifteen.getText());
            fifteen.setText("");
        } else if (Objects.equals(sixteen.getText(), "")) {
            sixteen.setText(fifteen.getText());
            fifteen.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
    @FXML
    protected void sixteenClick(ActionEvent event) {
        if (Objects.equals(twelve.getText(), "")) {
            twelve.setText(sixteen.getText());
            sixteen.setText("");
        } else if (Objects.equals(fifteen.getText(), "")) {
            fifteen.setText(sixteen.getText());
            sixteen.setText("");
        }
        trueResult1(one.getText(), two.getText(), three.getText(), four.getText(), five.getText(), six.getText(), seven.getText(), eight.getText(), nine.getText(), ten.getText(), eleven.getText(), twelve.getText(), thirteen.getText(), fourteen.getText(), fifteen.getText());
    }
}
