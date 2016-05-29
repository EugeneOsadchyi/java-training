package lesson_3.task_2;

public interface ITextAnalyzer {
    int countWords(String line);
    int countDigits(String line);
    LetterMatches countLetters(String line);
}
