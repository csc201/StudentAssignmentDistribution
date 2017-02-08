package course;

/**
 * Created by tkanchanawanchai6403 on 2/7/2017.
 */
public class Question {
    private String description;
    private String answer;
    private double score;

    public Question() {
        description = "What is Java?";
        answer = "A computer programming languge or a cup of coffee";
        score = 1.0;
    }

    public Question(String description, String answer, double score) {
        this.description = description;
        this.answer = answer;
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean equals(Question anotherQ) {
        return(description.equals(anotherQ.getDescription())&&answer.equals(anotherQ.getAnswer())&&score==anotherQ.getScore());
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                '}';
    }
}
