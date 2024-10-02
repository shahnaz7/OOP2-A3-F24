package com.champlain.oop2assignment3;

import java.util.Comparator;

public class SuitFirstComparator  implements Comparator<Card> {

    @Override
    public int compare(Card pc1, Card pc2) {
        // Compare only by suit
        return pc1.getSuit().compareTo(pc2.getSuit());
    }

}
