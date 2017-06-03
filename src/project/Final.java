/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Thnaa
 */
public class Final {
    String Question;
    String yourAnswer;
    String correct;
    int mark;

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public void setYourAnswer(String yourAnswer) {
        this.yourAnswer = yourAnswer;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getQuestion() {
        return Question;
    }

    public String getYourAnswer() {
        return yourAnswer;
    }

    public String getCorrect() {
        return correct;
    }

    public int getMark() {
        return mark;
    }
    

    public Final(String Question, String yourAnswer, String correct, int mark) {
        this.Question = Question;
        this.yourAnswer = yourAnswer;
        this.correct = correct;
        this.mark = mark;
    }
    
    
}
