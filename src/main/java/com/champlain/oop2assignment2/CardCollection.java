package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class CardCollection implements Iterable<Card>{
    @Override
    public String toString() {
        String result = "";
        for (Card currentCard : this) {
            result += currentCard.toString() + "\n";
        }
        return result;
    }
}
