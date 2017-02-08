import course.Question;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by tkanchanawanchai6403 on 2/8/2017.
 */
class StudentQuestionsTest {
    @Test
    void getStudentQuestions() {

    }

    @Test
    void addQuestion() {

    }

    @Test
    void addQuestion1() {

    }

    @Test
    void getCount() {

    }

    @Test
    void getQusetion() {
        ArrayList<Question> distributedList = new ArrayList<>();
        StudentQuestions studentQuestions = new StudentQuestions();
        Question [] theQuestions =  new Question [5];
        theQuestions[0] = new Question("Example Question One", "one", 1.0);
        theQuestions[1] = new Question("Example Question Two", "Two", 1.0);
        theQuestions[2] = new Question("Example Question Three", "Three", 1.0);
        theQuestions[3] = new Question("Example Question Four", "Four", 1.0);
        theQuestions[4] = new Question("Example Question Five", "Five", 1.0);
        studentQuestions.addQuestion(theQuestions);

        int studentCount = 5;
        for(int i=0; i<studentCount; i++) {
            distributedList.add(studentQuestions.getQusetion());
        }
        System.out.println(distributedList);
    }

}