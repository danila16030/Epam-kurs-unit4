package task02.logic;

import task02.entity.Sentence;
import task02.entity.Text;

public class TextAction {
    public void addSentence(Text text, Sentence sentence){
        text.getSentenceList().add(sentence);
    }
    public String getTextString(Text text) {
        String str = "";
        SentenceAction sentenceAction=new SentenceAction();
        for (Sentence sentence : text.getSentenceList()) {
            str += sentenceAction.getSentenceString(sentence);
        }
        return str;
    }
}
