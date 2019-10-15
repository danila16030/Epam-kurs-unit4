package task02.logic;

import task02.entity.Sentence;
import task02.entity.Text;
import task02.entity.Word;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("This");
        Word word2 = new Word("is");
        Word word3 = new Word("ok");
        List<Word> listWord = new ArrayList<>();
        listWord.add(word1);
        listWord.add(word2);
        listWord.add(word3);
        Sentence sentence = new Sentence(listWord);
        List<Sentence> sentenceList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sentenceList.add(sentence);
        }
        Text text = new Text("Normal text", sentenceList);
        getText(text);
        getHeading(text);
        addSentence(text,sentence);
        getText(text);
        getHeading(text);
    }
    public static void addSentence(Text text,Sentence sentence){
        TextAction textAction = new TextAction();
        textAction.addSentence(text, sentence);
    }

    public static void getText(Text text) {
        TextAction textAction = new TextAction();
        System.out.println(textAction.getTextString(text));
    }

    public static void getHeading(Text text) {
        System.out.println(text.getHeading());
    }
}
