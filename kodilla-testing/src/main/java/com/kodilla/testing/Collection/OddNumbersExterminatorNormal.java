package com.kodilla.testing.Collection;

import java.util.ArrayList;

public class OddNumbersExterminatorNormal {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numberTwo) {
        ArrayList<Integer> resultTwo = new ArrayList<Integer>();
        resultTwo.add(1);
        resultTwo.add(2);
        resultTwo.add(3);
        resultTwo.add(4);
        resultTwo.add(5);

        for (Integer Item : numberTwo) {
           if (Item % 2 == 0) {
               resultTwo.add(Item);
           } else {
               resultTwo.add(Item); }
        }
        return resultTwo;
    }
}



