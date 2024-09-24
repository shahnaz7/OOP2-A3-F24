package com.champlain.oop2assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hand extends CardCollection {
    private final List<Card> aCards = new ArrayList<>();

    public void addCard(Card pCard) {
        this.aCards.add(pCard);
    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }
}
