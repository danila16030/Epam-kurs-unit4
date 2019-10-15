package task02.entity;

import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> wordList;

    public Sentence( List<Word> wordList) {
        this.wordList = wordList;
        this.wordList.add(new Word("."));
    }


    public List<Word> getWordList() {
        return wordList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(wordList, sentence.wordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordList);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "wordList=" + wordList +
                '}';
    }
}
