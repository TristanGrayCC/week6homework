package card_game;

import card_game.*;
import java.util.*;

public class WinChecker {

  public String whoWins(Player player1, Player player2){
    int player1score = player1.getHand()[0].getNumber()+player1.getHand()[1].getNumber();
    int player2score = player2.getHand()[0].getNumber()+player2.getHand()[1].getNumber();
    String result = null;
    int player1result = 21 - player1score;
    int player2result = 21 - player2score;
    if (player1result < player2result){
     result = player1.getName() + " wins!";
    };
    if (player1result > player2result){
     result = player2.getName() + " wins!";
    };
    return result;
  }

}
