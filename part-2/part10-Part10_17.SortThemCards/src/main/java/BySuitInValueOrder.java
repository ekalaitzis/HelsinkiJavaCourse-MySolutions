
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card c1, Card c2) {
        int returnit = 0;

        if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
            returnit = c1.getValue() - c2.getValue();
        } else {
            returnit = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        }
        return returnit;
    }

}
