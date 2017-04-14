import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WinCheckerTest {
  Game game;
  Player player1;
  Player player2;
  Card card1;
  Card card2;
  Card card3;
  Card card4;
  WinChecker winChecker;

  @Before
  public void before(){
    game = new Game();
    player1 = new Player("Keith");
    player2 = new Player("Craig");
    card1 = new Card(2, Suit.Clubs);
    card2 = new Card(3, Suit.Spades);
    card3 = new Card(4, Suit.Diamonds);
    card4 = new Card(5, Suit.Clubs);
    player1.setHand(card1, card2);
    player2.setHand(card3, card4);
    winChecker = new WinChecker();
  }

  @Test
  public void higherWins(){
    assertEquals("Craig wins!", winChecker.whoWins(player1, player2));
  }

  @Test
  public void canDrawCard(){
    game.draw();
    assertNotNull(game.draw());
  }
}
