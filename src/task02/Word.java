package task02;

import java.util.Objects;

public class Word {
    private String wd;

    public Word(String word) {
        this.wd = word;
    }

    public String getWd() {
        return wd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(wd, word.wd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wd);
    }

    @Override
    public String toString() {
        return "Word{" +
                "wd='" + wd + '\'' +
                '}';
    }
}
