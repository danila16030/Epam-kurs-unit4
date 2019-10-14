package task02;

public class SentenceAction {
    public String getSentenceString(Sentence sentence) {
        String str = "";
        for (Word word : sentence.getWordList()) {
            str +=  word.getWd();
            str += " ";
        }
        return str;
    }
}
