package task02;

import java.util.List;

public class Sentence {
    private List<Word> wordList;

    public Sentence( List<Word> wordList) {
        this.wordList = wordList;
        this.wordList.add(new Word("."));
    }


    public List<Word> getWordList() {
        return wordList;
    }


}
