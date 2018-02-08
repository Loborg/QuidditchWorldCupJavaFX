package quidditch.businessLogic;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * @author Loborg
 */
public class MainViewController {
    
    @FXML ImageView quaffle_a;
    @FXML ImageView quaffle_b;
    @FXML ImageView snitch_a;
    @FXML ImageView snitch_b;
    @FXML Text score_team_a;
    @FXML Text score_team_b;
    
    private int score_a = 0;
    private int score_b = 0;
    
    
    @FXML private void onQuaffleClick(MouseEvent event){
        if (event.getSource() == quaffle_a){
            score_a = score_a + 10;
            score_team_a.setText(String.valueOf(score_a));
        } else if (event.getSource() == quaffle_b){
            score_b = score_b + 10;
            score_team_b.setText(String.valueOf(score_b));
        }
    }
    
    @FXML private void onSnichClick(MouseEvent event){
        if (event.getSource() == snitch_a){
            score_a = score_a + 150;
            score_team_a.setText(String.valueOf(score_a));
            setNodsMouseTransparent(true);
        } else if (event.getSource() == snitch_b){
            score_b = score_b + 150;
            score_team_b.setText(String.valueOf(score_b));
            setNodsMouseTransparent(true);
        }
    }
    
    /**
     * Sets all the ball imageViews mouseTransparencie 
     * isTransparent true = can not be clicked  
     * isTransparentis false = can be clicked**/
    private void setNodsMouseTransparent(boolean isTransparent){
        quaffle_a.setMouseTransparent(isTransparent);
        quaffle_b.setMouseTransparent(isTransparent);
        snitch_a.setMouseTransparent(isTransparent);
        snitch_b.setMouseTransparent(isTransparent);
    }
}
