package task02;

import java.util.List;

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



}
