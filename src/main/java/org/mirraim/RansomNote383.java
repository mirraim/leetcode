package org.mirraim;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. Ransom Note
 * Given two strings ransomNote and magazine, return true if ransomNote
 * can be constructed from magazine and false otherwise.
 * * Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> lettersMag = putChars(magazine.toCharArray());
        Map<Character, Integer> lettersNote = putChars(ransomNote.toCharArray());
        for (char letter : lettersNote.keySet()) {
            if (!lettersMag.containsKey(letter)) {
                return false;
            } else if (lettersMag.get(letter) < lettersNote.get(letter)) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> putChars(char[] chars) {
        Map<Character, Integer> letters = new HashMap<>();
        for (char letter: chars) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }
        return letters;
    }
}
