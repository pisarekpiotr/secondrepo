package com.kodilla.testing.Collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> number) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer Item : number) {
            if (Item % 2 == 0) {
                result.add(Item);
            }
        }
        return result;
    }
}


