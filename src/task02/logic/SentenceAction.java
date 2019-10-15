package task02.logic;

import task02.description.Sentence;
import task02.description.Word;

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
