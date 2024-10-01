package com.champlain.oop2assignment3;

import java.util.Comparator;

public class SuitFirstComparator  implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        // Compare only by suit
        return c1.getSuit().compareTo(c2.getSuit());
    }

}
