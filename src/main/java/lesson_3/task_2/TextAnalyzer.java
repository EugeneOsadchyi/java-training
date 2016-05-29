package lesson_3.task_2;

public class TextAnalyzer implements ITextAnalyzer {
    public int countWords(String line) {
        int wordsCount = 0;

        for (String word : line.split("\\s+")) {
            if (word.matches("\\w+")) wordsCount++;
        }

        return wordsCount;
    }

    public int countDigits(String line) {
        line = line.replaceAll("[^0-9]", "");
        return line.length();
    }

    public LetterMatches countLetters(String line) {
        LetterMatches letterMatches = new LetterMatches();

        for (int i = 0; i < line.length(); i++) {
            letterMatches.put(line.charAt(i));
        }

        return  letterMatches;
    }
}
