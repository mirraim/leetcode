package org.mirraim;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Tasks {

    public static int deadline(List<String> lines) {
        String[] first = lines.get(0).split(" ");
        int robot = Integer.parseInt(first[1]);
        int k = Integer.parseInt(first[2]);
        List<Integer> deadlines = new ArrayList<>();
        Stream.of(lines.get(1).split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(deadlines::add);
        int day = 0;
        for (int i = 1; i < k; ) {
            for (int deadline : deadlines) {
                int mess = (day - deadline) % robot;
                if (day >= deadline && (mess == 0)) {
                    i++;
                    break;
                }
            }
            day++;
        }
        return day;
    }
}
