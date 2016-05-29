package lesson_3.task_2;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new TextAnalyzer();

        System.out.println("Word Count test1: " + textAnalyzer.countWords(" some Text   rrr   s d  ggg   "));
        System.out.println("Word Count test2: " + textAnalyzer.countWords("     "));

        System.out.println("Number count test1: " + textAnalyzer.countDigits("s0dg sd g12g34 5g6 g g7 df 8sdg sdg 9"));
        System.out.println("Number count test1: " + textAnalyzer.countDigits("s  19f f fsdf sd"));

        System.out.println("Letters matches in text: " + textAnalyzer.countLetters("Hello World"));
        System.out.println("Letters matches in text: " + textAnalyzer.countLetters("bla gsd gsvsdbiutowe jbnpmnbnbsdg sxcvv dgwsdbefhner"));
    }
}
