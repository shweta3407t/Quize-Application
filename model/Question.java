package model;

import java.util.HashMap;

public class Question {
    public String question;
    public HashMap<String, String> mcq;
    public String correctAns;

    public Question(String q, HashMap<String, String> mcq, String corrAns) {
        this.question = q;
        this.mcq = mcq;
        this.correctAns = corrAns;
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<String, String> getOption() {
        return mcq;
    }

    public String getCorrAns() {
        return correctAns;
    }
}
