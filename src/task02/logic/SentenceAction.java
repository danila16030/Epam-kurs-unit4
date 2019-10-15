package task02.logic;

import task02.entity.Sentence;
import task02.entity.Word;

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
