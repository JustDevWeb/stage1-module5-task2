package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return numbersList -> {
            List<Integer> dl = new ArrayList<>();
            for( int number : numbersList ) {
                dl.add(number / divider);
            }
            return dl;
        };
    }
}
