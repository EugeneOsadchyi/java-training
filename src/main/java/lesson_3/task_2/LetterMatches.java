package lesson_3.task_2;

import java.util.Arrays;

public class LetterMatches {
    private char[] letters;
    private int[] matchesCount;

    public LetterMatches() {
        letters = new char[0];
        matchesCount = new int[0];
    }

    public void put(char c) {
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (letter == c) {
                matchesCount[i]++;
                return;
            }
        }
        increaseArraysSize();

        letters[letters.length - 1] = c;
        matchesCount[matchesCount.length - 1]++;
    }

    private void increaseArraysSize() {
        letters = Arrays.copyOf(letters, letters.length + 1);
        matchesCount = Arrays.copyOf(matchesCount, matchesCount.length + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < letters.length; i++) {
            sb.append("'" + letters[i] + "': " + matchesCount[i]);
            if (i != letters.length - 1) {
                sb.append("; ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
