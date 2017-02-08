import course.Question;
import course.Student;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class StudentQuestions {

    private int size = 5;
    private Question[] list;
    private int count=0;
    private ArrayList <Integer> distributedQuestionList = new ArrayList<>();

    public StudentQuestions() {
        list = new Question[size];
    }

    public StudentQuestions(int size) {
        this.size = size;
        list = new Question[size];
    }

    public Question[] getStudentQuestions()
    {
        return list;
    }

    public void addQuestion(Question question) {
        if(count>size) {
            enlarge();
        }
        list[count] = question;
        count++;
    }

    public void addQuestion(Question [] question) {
        if((count+question.length)>size) {
            enlarge();
        }
        for(int i=0; i<question.length; i++) {
            list[count] = question[i];
            count++;
        }
    }

    private void enlarge() {
        Question [] newList = new Question [list.length*2];
        for(int i=0; i<list.length; i++ ) {
            newList[i] = list[i];
        }
        list = newList;
    }

    public int getCount() {
        return count;
    }

    /**
     * This is a method that will return qustions to students with two constraints
     * 1. random question
     * 2. no duplicate
     * @return random question from the question bank with no duplicate
     */
    public Question getQusetion()
    {
        Random rand = new Random();
        int questionNumber;
        //check for duplicate
        do{
            questionNumber = (rand.nextInt(list.length));
        }while (duplicate(questionNumber));
        return (list[questionNumber]);
    }

    private boolean duplicate(int questionNumber) {
        boolean duplicate = false;
        if(!distributedQuestionList.contains(questionNumber)) {
            distributedQuestionList.add(questionNumber);
        } else {
            duplicate = true;
        }
        return duplicate;
    }

}



