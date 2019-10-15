package task02.description;

import java.util.List;
import java.util.Objects;

public class Text {
    private String heading;
    private List<Sentence> sentenceList;

    public Text(String heading, List<Sentence> sentenceList) {
        this.heading = heading;
        this.sentenceList = sentenceList;
    }

    public String getHeading() {
        return heading;
    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(heading, text.heading) &&
                Objects.equals(sentenceList, text.sentenceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heading, sentenceList);
    }

    @Override
    public String toString() {
        return "Text{" +
                "heading='" + heading + '\'' +
                ", sentenceList=" + sentenceList +
                '}';
    }
}
