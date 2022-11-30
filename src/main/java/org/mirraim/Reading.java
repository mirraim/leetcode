package org.mirraim;

import java.util.List;
import java.util.stream.Stream;

public class Reading {

    public static double read(List<String> list) {
        int quantity = Integer.parseInt(list.get(0));
        int[] times = Stream.of(list.get(1).split(" ")).mapToInt(Integer::parseInt).toArray();
        int negative = 0;
        for (int time : times) {
            if (time < 0) {
                negative ++;
            }
        }
        double q = (quantity * 2 - negative) / 2.0;
        double rsl = 0;
        for (int time : times) {
            rsl += Math.abs(time) * q;
        }
        return rsl / quantity;
    }
}
