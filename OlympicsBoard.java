// I did not collaborate with anyone on this assignment
import java.util.Scanner; 

public class OlympicsBoard {
    //Declaring parameters
    String question;
    String[] answers;
    Integer CorrectAnswer;
    Integer WrongAnswer;
    Scanner scanner;

    /* Constructor */
    public OlympicsBoard(String question, Integer CorrectAnswer, Integer WrongAnswer, String... questionAnswsers){
        this.question = question;
        this.answers = questionAnswsers;
        this.CorrectAnswer = CorrectAnswer;
        this.WrongAnswer = WrongAnswer;
    }

    /** 
     * Get questions from tile
     * @return question - question of the spot
     */
    public String getQuestion(){
        return question;
    }

    /** 
     * Get multiple choice answers
     * @return answers - possible answer choices of the spot
     */
    public String[] getAnswer(){
        return answers;
    }

    /** 
     * Get the correct answer to the question 
     * @return CorrectAnswer - index of the correct answer of the spot
     */
    public Integer getCorrectAnswer(){
        return CorrectAnswer;
    }    

    /** 
     * Get the incorrect answer to the question 
     * @return WrongAnswer - index of the incorrect answer of the spot
     */
    public Integer getWrongAnswer(){
        return WrongAnswer;
    }

    /**
     * want this to return a type of true or false
     * boolean?? 
     */
    //public Integer checkAnwser(){
        //return checkAnswer;
    //}


    //somewhere I want to add place to collect all questions and answers, maybe make new java doc for this
}

