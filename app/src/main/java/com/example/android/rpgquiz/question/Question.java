package com.example.android.rpgquiz.question;


import java.util.Arrays;

/**
 * The {@link Question} class represents a question that can know the correct answer, if it was passed, etc...
 *
 * @author Fábio Gouveia
 * @version 1.0
 */
public class Question {

    //Instance private members
    private String question;
    private String[] possibleAnswers;
    private boolean[] possibleAnswersState;
    private boolean passed;

    /**
     * This is a {@link Question} object public constructor, this object is used to instantiate a new {@link Question} object
     *
     * @param question            A {@code String} representing this textual question.
     * @param possibleAnswer      A {@code String} array with all the possible answers for this question.
     * @param possibleAnswerState A {@code boolean} array with all the possible answers state, true = correct / false = incorrect answer.
     * @param passed              A {@code boolean} representing if this question was passed.
     */
    public Question(String question, String[] possibleAnswer, boolean[] possibleAnswerState, boolean passed) {
        this.question = question;
        this.possibleAnswers = possibleAnswer;
        this.possibleAnswersState = possibleAnswerState;
        this.passed = passed;
    }


    /**
     * Returns a {@code String} representing this textual question.
     *
     * @return a <tt>String</tt> representing this textual question.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method set up a new textual question
     **/
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Return a {@code String} array representing the possible answers for this question.
     *
     * @return a <tt>String</tt> array representing the possible answers for this question.
     */
    public String[] getPossibleAnswers() {
        return possibleAnswers;
    }

    /**
     * Returns a {@code boolean} representing the question passed state, true = passed / false = not passed.
     *
     * @return a <tt>boolean</tt> representing the question passed state.
     */
    public boolean passed() {
        return passed;
    }

    /**
     * This method change the passed state
     **/
    public void setPassed(boolean passed) {
        this.passed = passed;
    }


    /**
     * This method is used to verify a textual answer.
     *
     * @param answer A {@code String} representing a textual answer.
     * @return a <tt>boolean</tt> representing if the answer is right, true = right / false = wrong.
     */
    public boolean checkAnswer(String answer) {

        /*
            TODO : 1 - Get answer string from assets/questions.json
            TODO : 2 - Compare the two strings using equalsIgnoreCase method
            TODO : 3 - Return the result
        */

        return false;//#TESTE ONLY
    }

    /**
     * This method is used to verify a multiple choice answer.
     * This method works both on one or multiple right answers.
     *
     * @param answerState A {@code boolean} array with user choices, each choice selected is equal to {@code true}.
     * @return a <tt>boolean</tt> representing if the answers was right, true = right / false = wrong.
     */
    public boolean checkAnswer(boolean[] answerState) {

        //Compare the values on the answer state arrays and assign it to passed variable
        if (passed = Arrays.equals(possibleAnswersState, answerState)) {
            // Question passed...
        } else {
            // Upsss...Not passed..!
        }

        return passed;
    }
}
