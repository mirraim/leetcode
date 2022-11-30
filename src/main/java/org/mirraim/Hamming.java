package org.mirraim;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Hamming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> lines = new ArrayList<>();
        while (reader.ready()) {
            lines.add(reader.readLine());
        }


        int length = Integer.parseInt(lines.get(0).split(" ")[0]);

        for (int i = 1; i < lines.size(); i++) {
            //char[] first = lines.get(i).substring(0, length).toCharArray();
            //char[] second = lines.get(i).substring(length).toCharArray();

            writer.write(calc(lines.get(i), length));
        }
        reader.close();
        writer.close();
    }

    public static String calc(String line, int length) {
            char[] first = line.split(" ")[0].toCharArray();
            char[] second = line.split(" ")[1].toCharArray();
            char[] rsl = new char[length];
            List<Integer> indexes = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                if (first[j] != second[j]) {
                    indexes.add(j);
                } else rsl[j] = first[j];
            }

            if (!indexes.isEmpty()) {
              int count = 0;
              for(int index : indexes) {
                  rsl[index] = count % 2 == 0 ? first[index] : second [index];
                  count++;
              }
            }
           return new String(rsl);
    }
}
